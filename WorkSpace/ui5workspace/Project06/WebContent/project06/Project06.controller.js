var oModel = '';
var mode = '';
sap.ui.controller("project06.Project06", {

/**
* Called when a controller is instantiated and its View controls (if available) are already created.
* Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
* @memberOf project06.Project06
*/
	onInit: function() {
		//서비스(SRV)까지만 불러오기
		oModel = new sap.ui.model.odata.ODataModel("proxy/http/ehp8.innoever.net:8080/sap/opu/odata/sap/ZEDU24_07_UI5_SRV");
		sap.ui.getCore().setModel(oModel);
		},


/**
* Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
* (NOT before the first rendering! onInit() is used for that one!).
* @memberOf project06.Project06
*/
//	onBeforeRendering: function() {
//
//	},

/**
* Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
* This hook is the same one that SAPUI5 controls get after being rendered.
* @memberOf project06.Project06
*/
//	onAfterRendering: function() {
//
//	},

/**
* Called when the Controller is destroyed. Use this one to free resources and finalize activities.
* @memberOf project06.Project06
*/
//	onExit: function() {
//
//	}

});