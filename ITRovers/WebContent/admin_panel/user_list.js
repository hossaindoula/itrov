Ext.require([
    'Ext.grid.*',
    'Ext.data.*',
    'Ext.util.*',
    'Ext.state.*',
    'Ext.form.*'
]);

Ext.onReady(function(){
    // Define our data model ,'user' in this case.
    Ext.define('User', {
        extend: 'Ext.data.Model',
        fields: [
            { name: 'id', type: 'int'},
            { name: 'username', type: 'string' },
            { name: 'password', type: 'string' },
            { name: 'active', type: 'string' }
        ]
    });


    // create the Data Store         // interaction with methods of controller class
    var store = Ext.create('Ext.data.JsonStore', {
        // destroy the store if the grid is destroyed
        autoDestroy: true,
        model: 'User',
        proxy: {             //    types of data rendering , used in data retrieve process. type of data which is being sent from controller
            type: 'ajax',
            url: 'userJsonData.itr',
            reader: {                    // parsing data type
                type: 'json',
                root: 'userList',
                idProperty: 'id',
                totalProperty: 'total'
            }
        },
        autoLoad : true

    })

    var rowEditing = Ext.create('Ext.grid.plugin.RowEditing', {
        clicksToMoveEditor: 1,
        autoCancel: false
    });

    // create the grid and specify what field you want
    // to use for the editor at each column.
    var grid = Ext.create('Ext.grid.Panel', {            // as is entity
        store: store,
        columns: [{
            header: 'ID',
            dataIndex: 'id'
        }, {
            header: 'Username',
            dataIndex: 'username',
            width: 160
        }, {
            header: 'Password',
            dataIndex: 'password',
            width: 90
        }, {
            header: 'Active',
            dataIndex: 'active',
            width: 90
        }],
        renderTo: 'user-grid',
        width: 600,
        height: 400,
        title: 'Users',
        frame: true,
        tbar: [{
            text: 'Add Users',
            iconCls: 'employee-add',
            handler : function() {

            }
        }, {
            itemId: 'removeEmployee',
            text: 'Remove Employee',
            iconCls: 'employee-remove',
            handler: function() {

            },
            disabled: true
        }],
        plugins: [rowEditing],
        listeners: {
            'selectionchange': function(view, records) {
                //grid.down('#removeEmployee').setDisabled(!records.length);
            }
        }
    });
});