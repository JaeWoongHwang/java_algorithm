sap.ui.jsview("project04.Project04", {

	/**
	 * Specifies the Controller belonging to this View. In the case that it is
	 * not implemented, or that "null" is returned, this View does not have a
	 * Controller.
	 * 
	 * @memberOf project04.Project04
	 */
	getControllerName : function() {
		return "project04.Project04";
	},

	/**
	 * Is initially called once after the Controller has been instantiated. It
	 * is the place where the UI is constructed. Since the Controller is given
	 * to this method, its event handlers can be attached right away.
	 * 
	 * @memberOf project04.Project04
	 */
	createContent : function(oController) {
//		var oTable = new sap.ui.table.Table({
//			title : " ZTUI524_01 Table ",
//			visibleRowCount : 8,
//			selectionMode : sap.ui.table.SelectionMode.Single,
//			navigationMode : sap.ui.table.NavigationMode.Paginator,
//			fixedColumnCount : 2,
//			width : "1000px"
//		});

		var oDataset = new sap.viz.ui5.data.FlattenedDataset({
			dimensions : [ {
				axis : 1,
				name : '코스트센터',
				value : "{Kostl}"
			} ],
			measures : [ {
				name : '금액',
				value : '{Wrbtr}'
			} ],
			data : {
				path : "/ZTUI524_01Set",
				filters : [ 
//					new sap.ui.model.Filter("Kostl",
//						sap.ui.model.FilterOperator.EQ, "1200") \
					]
			}
		});

		var oChart = new sap.viz.ui5.Donut({
			width : "80%",
			height : "400px",
			title : {
				visible : true,
				text : 'Company Code Chart'
			},
		});

//		oTable.bindRows("/ZTUI524_01Set");
//		oTable.setModel(oModel);
		oChart.setDataset(oDataset);
		oChart.setModel(oModel);
		return oChart;
	}

});
