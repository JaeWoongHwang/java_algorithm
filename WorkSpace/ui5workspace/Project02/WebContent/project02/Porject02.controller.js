var oModel = '';
var mode = 'create';
//Controller에서 모든 Event를 다룸
sap.ui.controller("project02.Porject02", {

/**
* Called when a controller is instantiated and its View controls (if available) are already created.
* Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
* @memberOf project02.Porject02
*/
	onInit: function() {
		//서비스(SRV)까지만 불러오기
		oModel = new sap.ui.model.odata.ODataModel("proxy/http/ehp8.innoever.net:8080/sap/opu/odata/sap/ZEDU24_05_UI5_SRV");
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
			"Sabun": $("#Sabun").val(),
			"Name": $("#Name").val(),
			"Mobile": $("#Mobile").val(),
			"Gender": $("#Gender").val(),
			"Area": $("#Area").val()
		}
		
		if(mode == 'create'){
			oModel.create('/ZTUI524Set',
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
			oModel.update("/ZTUI524Set(Sabun='"+newData.Sabun+"')",
					newData,
					null,
					function(){
						sap.ui.getCore().getModel().refresh();
					             	$("#form1").slideUp();
					},function(){
						alert("Update failed");
					});
		}else if(mode == 'delete'){
			oModel.remove("/ZTUI524Set(Sabun='"+key+"')",
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
			$("#Sabun").val(cols[0].getText());
			$("#Name").val(cols[1].getText());
			$("#Mobile").val(cols[2].getText());
			$("#Gender").val(cols[3].getText());
			$("#Area").val(cols[4].getText());
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
* @memberOf project02.Porject02
*/
//	onBeforeRendering: function() {
//
//	},

/**
* Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
* This hook is the same one that SAPUI5 controls get after being rendered.
* @memberOf project02.Porject02
*/
//	onAfterRendering: function() {
//
//	},

/**
* Called when the Controller is destroyed. Use this one to free resources and finalize activities.
* @memberOf project02.Porject02
*/
//	onExit: function() {
//
//	}

});