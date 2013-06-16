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
	                    return '<b>'+ this.point.name +'</b><br/>Percentage : <b>'+ Math.round(this.percentage) +' %</b><br/>Sales : <b>'+ Highcharts.numberFormat(this.point.y, 0) +'</b>'
	                    +'<br/> avatar : <img width="30px" height="30px" src="http://localhost:8080/Reporting/faces/photos/i.qandoussi.jpg" alt="hahaha"/>';
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
			

alert("fin javascript");