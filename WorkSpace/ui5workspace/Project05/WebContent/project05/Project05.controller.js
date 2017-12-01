var oModel = '';
var mode = 'create';
sap.ui.controller("project05.Project05", {

/**
* Called when a controller is instantiated and its View controls (if available) are already created.
* Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
* @memberOf project05.Project05
*/
	onInit: function() {
		//서비스(SRV)까지만 불러오기
		oModel = new sap.ui.model.odata.ODataModel("proxy/http/ehp8.innoever.net:8080/sap/opu/odata/sap/ZEDU24_06_UI5_SRV");
		sap.ui.getCore().setModel(oModel);
		},
        //proxy/http/는 고정 그 다음은 내 서비스 url
		//ODataModel객체 안에 CRUD기능이 모두 내포 되어 있고 ODataModel로 인해 각 CRUD 메소드로 이동
	create: function(){
		mode = "create";
		$("#form1").slideDown();	// JQUERY 기능
	},

	save: function(key){
		sap.ui.getCore().setModel(oModel);
		oModel.setHeaders({"X-Requested-With": "XMLHttpRequest",    //mandatory
			                 "Content-Type": "application/atom+xml",
			                 "DataServiceVersion": "2.0",
			                 "X-CSRF-Token": "Fetch"});
			
		var newData = {
			"Kokrs": $("#Kokrs").val(),
			"Bukrs": $("#Bukrs").val(),
			"Kostl": $("#Kostl").val(),
			"Wrbtr": $("#Wrbtr").val(),
			"Waers": $("#Waers").val()
		}
		
		if(mode == 'create'){
			oModel.create('/ZTUI524_01Set',
				newData,
				null,
				function(){
					sap.ui.getCore().getModel().refresh();
		          			$("#form1").slideUp();
				},function(){
					alert("Create failed");
				}
		        );
		}else if(mode == 'edit'){
			oModel.update("/ZTUI524_01Set(Kokrs='"+newData.Kokrs+"',Bukrs='"+newData.Bukrs+"',Kostl='"+newData.Kostl+"')",
   					newData,
					null,
					function(){
						sap.ui.getCore().getModel().refresh();
					             	$("#form1").slideUp();
					},function(){
						alert("Update failed");
					});
		}else if(mode == 'delete'){
			oModel.remove("/ZTUI524_01Set(Kokrs='"+newData.Kokrs+"',Bukrs='"+newData.Bukrs+"',Kostl='"+newData.Kostl+"')",
					newData,
					null,
					function(){
					sap.ui.getCore().getModel().refresh();
					},function(){
						alert("Delete failed");
					});
			}

	},
	
edit: function() {
		
		mode = 'edit';
		
		var oTable = sap.ui.getCore().byId("itab1");
		var sel_idx = oTable.getSelectedIndex();
		
		var rows = oTable.getRows();
		var cols = rows[sel_idx].getCells();
		
		$("#form1").slideDown(function(){
			$("#Kokrs").val(cols[0].getText());
			$("#Bukrs").val(cols[1].getText());
			$("#Kostl").val(cols[2].getText());
			$("#Wrbtr").val(cols[3].getText());
			$("#Waers").val(cols[4].getText());
		});
		
},

remove: function() {
	
	mode = 'delete';
	
	var oTable = sap.ui.getCore().byId("itab1");
	var sel_idx = oTable.getSelectedIndex();
	
	var rows = oTable.getRows();
	var cols  = rows[sel_idx].getCells();

	this.save(cols[0].getText());
},

/**
* Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
* (NOT before the first rendering! onInit() is used for that one!).
* @memberOf project05.Project05
*/
//	onBeforeRendering: function() {
//
//	},

/**
* Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
* This hook is the same one that SAPUI5 controls get after being rendered.
* @memberOf project05.Project05
*/
//	onAfterRendering: function() {
//
//	},

/**
* Called when the Controller is destroyed. Use this one to free resources and finalize activities.
* @memberOf project05.Project05
*/
//	onExit: function() {
//
//	}

});