/**
 * Created with IntelliJ IDEA.
 * User: Ninad
 * Date: 2013-06-14
 * Time: 10:49
 * To change this template use File | Settings | File Templates.
 */

Ext.require([
    'Ext.grid.*',
    'Ext.data.*',
    'Ext.util.*',
    'Ext.state.*',
    'Ext.form.*'
]);


Ext.onReady(function(){
    // Define our data model ,'user' in this case.
    Ext.define('AuthorizedGroups', {
        extend: 'Ext.data.Model',
        fields: [
            { name: 'id', type: 'long'},
            { name: 'name', type: 'string' },
            { name: 'description', type: 'string' }

        ]
    });


// create the Data Store         // interaction with methods of controller class
    var store = Ext.create('Ext.data.JsonStore', {
        // destroy the store if the grid is destroyed
        autoDestroy: true,
        model: 'AuthorizedGroups',
        proxy: {             //    types of data rendering , used in data retrieve process. type of data which is being sent from controller
            type: 'ajax',
            url: 'authorizedGroupsJsonData.itr',
            reader: {                    // parsing data type
                type: 'json',
                root: 'authorizedGroupsList',
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
            header: 'AUTH GROUP ID',
            dataIndex: 'id'
        },{
            header: 'AUTH GROUP NAME',
            dataIndex: 'name'

        },{
            header: 'DESCRIPTION',
            dataIndex: 'description'

        }
        ],
        renderTo: 'authorizedGroups-grid',
        width: 600,
        height: 400,
        title: 'AuthorizedGroups',
        frame: true,
        tbar: [{
            text: 'Add Contents',
            iconCls: 'content-add',
            handler : function() {

            }
        }],
        plugins: [rowEditing],
        listeners: {
            'selectionchange': function(view, records) {
                //grid.down('#removeEmployee').setDisabled(!records.length);
            }
        }
    });
});
