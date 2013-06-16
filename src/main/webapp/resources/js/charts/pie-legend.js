//Highcharts.getOptions().colors = Highcharts.map(Highcharts.getOptions().colors, function(color) {
//		    return {
//		        radialGradient: { cx: 0.5, cy: 0.3, r: 0.7 },
//		        stops: [
//		            [0, color],
//		            [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
//		        ]
//		    };
//		});




function createPie(id,title,year,data){
	$(function () {
	    //var chart;
		
//		Highcharts.getOptions().colors = Highcharts.map(Highcharts.getOptions().colors, function(color) {
//		    return {
//		        radialGradient: { cx: 0.5, cy: 0.3, r: 0.7 },
//		        stops: [
//		            [0, color],
//		            [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
//		        ]
//		    };
//		});
	    
	    $(document).ready(function () {
	    	
	    	// Build the chart
	        $(id).highcharts({
	        	
	            chart: {
	                plotBackgroundColor: null,
	                plotBorderWidth: null,
	                plotShadow: false
	            },
	            
	            title: {
	                text: title+', '+year
	            },
	            tooltip: {
//	        	    pointFormat: 'Percentage : <b>'+ Highcharts.numberFormat('{point.percentage}', 2)+'%</b><br/>Sales : <b>{point.y}</b>',
//	            	percentageDecimals: 1
	            	useHTML: true,
	            	formatter: function() {
	                    return '<b>'+ this.point.name +'</b><br/>Percentage : <b>'+ Math.round(this.percentage) +' %</b><br/>Value : <b>'+ Highcharts.numberFormat(this.point.y, 0) +'</b>';
	                 }
	            },
	            plotOptions: {
	                pie: {
	                    allowPointSelect: true,
	                    cursor: 'pointer',
	                    dataLabels: {
	                        enabled: false
	                    },
	                    showInLegend: true
	                }
	            },
	            legend: {
	            	itemWidth:150,
	                layout: 'vertical',
	                align: 'right',
	                verticalAlign: 'top',
	                x: 30,
	                y: 40,					
	                borderWidth: 0,
	                floating: true
	            },
	            credits : {
	                enabled : false}
	            ,
	            series: [{
	                type: 'pie',
	                name: 'Browser share',
	                data: data
	            }]
	        });
	    });
	    
	});
}

function createPieAbr(id,title,year,data){
	$(function () {
	    //var chart;
		
//		Highcharts.getOptions().colors = Highcharts.map(Highcharts.getOptions().colors, function(color) {
//		    return {
//		        radialGradient: { cx: 0.5, cy: 0.3, r: 0.7 },
//		        stops: [
//		            [0, color],
//		            [1, Highcharts.Color(color).brighten(-0.3).get('rgb')] // darken
//		        ]
//		    };
//		});
	    
	    $(document).ready(function () {
	    	
	    	// Build the chart
	        $(id).highcharts({
	        	
	            chart: {
	                plotBackgroundColor: null,
	                plotBorderWidth: null,
	                plotShadow: false
	            },
	            
	            title: {
	                text: title+', '+year
	            },
	            tooltip: {
//	        	    pointFormat: 'Percentage : <b>'+ Highcharts.numberFormat('{point.percentage}', 2)+'%</b><br/>Sales : <b>{point.y}</b>',
//	            	percentageDecimals: 1
	            	useHTML: true,
	            	formatter: function() {
	                    return '<b>'+ this.point.name.substr( 0,this.point.name.indexOf(";")) +'</b><br/>Percentage : <b>'+ Math.round(this.percentage) +' %</b><br/>Value : <b>'+ Highcharts.numberFormat(this.point.y, 0) +'</b>';
	                 }
	            },
	            plotOptions: {
	                pie: {
	                    allowPointSelect: true,
	                    cursor: 'pointer',
	                    dataLabels: {
	                        enabled: false
	                    },
	                    showInLegend: true
	                }
	            },
	            legend: {
	            	labelFormatter: function() {
	                    return this.name.substr( this.name.indexOf(";")+1,this.name.length);
	                 },
	            	itemWidth:150,
	                layout: 'vertical',
	                align: 'right',
	                verticalAlign: 'top',
	                x: 30,
	                y: 40,					
	                borderWidth: 0,
	                floating: true
	            },
	            credits : {
	                enabled : false}
	            ,
	            series: [{
	                type: 'pie',
	                name: 'Browser share',
	                data: data
	            }]
	        });
	    });
	    
	});
}

function createPieAbrAvatar(id,title,year,data){
	$(function () {
	    $(document).ready(function () {
	    	
	    	// Build the chart
	        $(id).highcharts({
	        	
	            chart: {
	                plotBackgroundColor: null,
	                plotBorderWidth: null,
	                plotShadow: false
	            },
	            
	            title: {
	                text: title+', '+year
	            },
	            tooltip: {
	            	useHTML: true,
	            	style: {
	            		color: '#333333',
	            		fontSize: '12px',
	            		height:'300px'
	            		
	            	},
	            	formatter: function() {
	                    return '<div style="height:150px;width:200px;"><div><br/> <center><img width="50px" height="50px" src="photos/'
	                    +this.point.name.substr( this.point.name.indexOf(";")+1,this.point.name.length)
	                    +'.jpg" alt="PM avatar"/> </center><br/></div>'
	                    +'<div style="margin:10px;margin-left:20px;"><b>'+ this.point.name.substr( 0,this.point.name.indexOf(";")) 
	                    +'</b><br/>Percentage : <b>'+ Math.round(this.percentage) 
	                    +' %</b><br/>Value : <b>'+ Highcharts.numberFormat(this.point.y, 0) +'</b></div></div>'
	                    ;
	                 }
	            },
	            plotOptions: {
	                pie: {
	                    allowPointSelect: true,
	                    cursor: 'pointer',
	                    dataLabels: {
	                        enabled: false
	                    },
	                    showInLegend: true
	                }
	            },
	            legend: {
	            	labelFormatter: function() {
	                    return this.name.substr( this.name.indexOf(";")+1,this.name.length);
	                 },
	            	itemWidth:150,
	                layout: 'vertical',
	                align: 'right',
	                verticalAlign: 'top',
	                x: 30,
	                y: 40,					
	                borderWidth: 0,
	                floating: true
	            },
	            credits : {
	                enabled : false}
	            ,
	            series: [{
	                type: 'pie',
	                name: 'Browser share',
	                data: data
	            }]
	        });
	    });
	    
	});
}
			

//alert("fin pie-legend.js");