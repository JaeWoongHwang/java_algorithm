sap.ui.jsview("project07.Project07", {

	/**
	 * Specifies the Controller belonging to this View. In the case that it is
	 * not implemented, or that "null" is returned, this View does not have a
	 * Controller.
	 * 
	 * @memberOf project07.Project07
	 */
	getControllerName : function() {
		return "project07.Project07";
	},

	/**
	 * Is initially called once after the Controller has been instantiated. It
	 * is the place where the UI is constructed. Since the Controller is given
	 * to this method, its event handlers can be attached right away.
	 * 
	 * @memberOf project07.Project07
	 */
	createContent : function(oController) {
		{
			var oTable = new sap.ui.table.Table({
				title : " ZTUI524_02 Table ",
				visibleRowCount : 8,
				selectionMode : sap.ui.table.SelectionMode.Single,
				navigationMode : sap.ui.table.NavigationMode.Paginator,
				fixedColumnCount : 2,
				width : "1000px"
			});
			var oMatrix = new sap.ui.commons.layout.MatrixLayout({
				width : '300px',
				columns : 3
			});

			// Table
			var oTable = new sap.ui.table.Table("itab1", {
				visibleRowCount : 10
			});

			oTable.addColumn(new sap.ui.table.Column({
				label : new sap.ui.commons.Label({
					text : "Company Code"
				}),
				template : new sap.ui.commons.TextView().bindProperty("text",
						"Bukrs")
			}));

			oTable.addColumn(new sap.ui.table.Column({
				label : new sap.ui.commons.Label({
					text : "Plant"
				}),
				template : new sap.ui.commons.TextView().bindProperty("text",
						"Werks")
			}));

			oTable.addColumn(new sap.ui.table.Column({
				label : new sap.ui.commons.Label({
					text : "Material Number"
				}),
				template : new sap.ui.commons.TextView().bindProperty("text",
						"Matnr")
			}));

			oTable.addColumn(new sap.ui.table.Column({
				label : new sap.ui.commons.Label({
					text : "Quantity"
				}),
				template : new sap.ui.commons.TextView().bindProperty("text",
						"Menge")
			}));

			oTable.addColumn(new sap.ui.table.Column({
				label : new sap.ui.commons.Label({
					text : "Base of unit maesure"
				}),
				template : new sap.ui.commons.TextView().bindProperty("text",
						"Meins")
			}));

			oTable.bindRows("/ZTUI524_02Set");

			var oShell = new sap.ui.ux3.Shell({
				appTitle : "Material",
				showSearchTool : false,
				showFeederTool : false,
				worksetItems : [ new sap.ui.ux3.NavigationItem("oNavItem1", {
					key : "Nav_1",
					text : "Table"
				}) ],
				content : oTable,
			});

			return oShell;
						
			var ele = [ oMatrix, oTable ];

			return ele;

		
		}
	}
});