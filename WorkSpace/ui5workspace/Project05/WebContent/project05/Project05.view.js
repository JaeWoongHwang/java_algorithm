sap.ui.jsview("project05.Project05", {

	/** Specifies the Controller belonging to this View. 
	* In the case that it is not implemented, or that "null" is returned, this View does not have a Controller.
	* @memberOf project05.Project05
	*/ 
	getControllerName : function() {
		return "project05.Project05";
	},

	/** Is initially called once after the Controller has been instantiated. It is the place where the UI is constructed. 
	* Since the Controller is given to this method, its event handlers can be attached right away. 
	* @memberOf project05.Project05
	*/ 
	createContent : function(oController) {	var oMatrix = new sap.ui.commons.layout.MatrixLayout({
		width : '300px',
		columns : 3
	});

	oMatrix.createRow(new sap.ui.commons.Button({
		text : "Create",
		width : "100px",
		press : function() {
			oController.create();
		}
	}),

	new sap.ui.commons.Button({
		text : "Edit",
		width : "100px",
		press : function() {
			oController.edit();
		}
	}),

	new sap.ui.commons.Button({
		text : "Delete",
		width : "100px",
		press : function() {
			oController.remove();
		}
	})

	);

	// Table
	var oTable = new sap.ui.table.Table("itab1", {
		visibleRowCount : 10
	});

	oTable.addColumn(new sap.ui.table.Column({
		label : new sap.ui.commons.Label({
			text : "Controlling Area"
		}),
		template : new sap.ui.commons.TextView().bindProperty("text",
				"Kokrs")
	}));

	oTable.addColumn(new sap.ui.table.Column({
		label : new sap.ui.commons.Label({
			text : "Company Code"
		}),
		template : new sap.ui.commons.TextView().bindProperty("text",
				"Bukrs")
	}));

	oTable.addColumn(new sap.ui.table.Column({
		label : new sap.ui.commons.Label({
			text : "Cost Center"
		}),
		template : new sap.ui.commons.TextView().bindProperty("text",
				"Kostl")
	}));

	oTable.addColumn(new sap.ui.table.Column({
		label : new sap.ui.commons.Label({
			text : "Amount in Currency"
		}),
		template : new sap.ui.commons.TextView().bindProperty("text",
				"Wrbtr")
	}));

	oTable.addColumn(new sap.ui.table.Column({
		label : new sap.ui.commons.Label({
			text : "Currency Key"
		}),
		template : new sap.ui.commons.TextView().bindProperty("text",
				"Waers")
	}));

	oTable.bindRows("/ZTUI524_01Set");

	var oform = new sap.ui.layout.form.SimpleForm("form1", {
		title : "Data Maintainance",
		content : [ new sap.ui.commons.Label({
			text : "Controlling Area"
		}), new sap.ui.commons.TextField("Kokrs", {
			width : "200px"
		}),

		new sap.ui.commons.Label({
			text : "Company Code"
		}), new sap.ui.commons.TextField("Bukrs", {
			width : "200px"
		}),

		new sap.ui.commons.Label({
			text : "Cost Center"
		}), new sap.ui.commons.TextField("Kostl", {
			width : "200px"
		}),

		new sap.ui.commons.Label({
			text : "Amount in Currency"
		}), new sap.ui.commons.TextField("Wrbtr", {
			width : "200px"
		}),

		new sap.ui.commons.Label({
			text : "Currency Key"
		}), new sap.ui.commons.TextField("Waers", {
			width : "200px"
		}),

		new sap.ui.commons.Label({
			text : ""
		}), new sap.ui.commons.Button({
			text : "Save",
			width : "100px",
			press : function() {
				oController.save();
			}
		}) ]
	});

	var ele = [ oMatrix, oTable, oform ];

	return ele;

}

});