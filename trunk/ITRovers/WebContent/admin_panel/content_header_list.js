/**
 * Created with IntelliJ IDEA.
 * User: Administrator
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
    Ext.define('ContentHeader', {
        extend: 'Ext.data.Model',
        fields: [
            { name: 'id', type: 'int'},
            { name: 'title', type: 'string' },
            { name: 'url', type: 'string' },
            { name: 'parentContent', type: 'string' }
        ]
    });


// create the Data Store         // interaction with methods of controller class
    var store = Ext.create('Ext.data.JsonStore', {
        // destroy the store if the grid is destroyed
        autoDestroy: true,
        model: 'ContentHeader',
        proxy: {             //    types of data rendering , used in data retrieve process. type of data which is being sent from controller
            type: 'ajax',
            url: 'contentHeaderJsonData.itr',
            reader: {                    // parsing data type
                type: 'json',
                root: 'contentHeaderList',
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
        },{
            header: 'URL',
            dataIndex: 'url'

        },{
            header: 'TITLE',
            dataIndex: 'title'

        },{
            header: 'PARENT CONTENT',
            dataIndex: 'parentContent'

        }
        ],
        renderTo: 'contents-grid',
        width: 600,
        height: 400,
        title: 'Contents',
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
