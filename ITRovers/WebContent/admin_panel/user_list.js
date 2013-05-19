Ext.require([
    'Ext.grid.*',
    'Ext.data.*',
    'Ext.util.*',
    'Ext.state.*',
    'Ext.form.*'
]);

Ext.onReady(function(){
    // Define our data model
    Ext.define('User', {
        extend: 'Ext.data.Model',
        fields: [
            { name: 'id', type: 'int'},
            { name: 'username', type: 'string' },
            { name: 'password', type: 'string' },
            { name: 'active', type: 'string' }
        ]
    });



    // create the Data Store
    var store = Ext.create('Ext.data.Store', {
        // destroy the store if the grid is destroyed
        autoDestroy: true,
        model: 'User',
        url: 'userJsonData.itr',
        reader: new Ext.data.JsonReader({
            root: 'userList',
            totalProperty: 'totalCount',
            id: 'id'
        },[
            {name: 'id', type: 'int', mapping: 'id'},
            {name: 'username', type: 'string', mapping: 'username'},
            {name: 'password', type: 'string', mapping: 'password'},
            {name: 'active', type: 'string', mapping: 'active'}
        ]),
        autoLoad : true

    })

    var rowEditing = Ext.create('Ext.grid.plugin.RowEditing', {
        clicksToMoveEditor: 1,
        autoCancel: false
    });

    // create the grid and specify what field you want
    // to use for the editor at each column.
    var grid = Ext.create('Ext.grid.Panel', {
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