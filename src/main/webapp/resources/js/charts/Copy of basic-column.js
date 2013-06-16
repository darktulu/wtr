function createChart(id,title,year,color,data){
				$(function () {
					
			        $(id).highcharts({
			            chart: {
			                type: 'column',
			                marginRight: 10,
			                marginBottom: 25
			            },
			            title: {
			                text: title,
			                x: -20 //center
			            },
			            subtitle: {
			                text: 'Year: '+year,
			                x: -20
			            },
			            xAxis: {
			                categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun','Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
			            },
			            yAxis: {
			                title: {
			                    text: 'Sales (MAD)'
			                },
			                plotLines: [{
			                    value: 0,
			                    width: 1,
			                    color: '#808080'
			                }]
			            },
			            tooltip: {
			                //valueSuffix: '°C'
			            	formatter: function() {
			                    return this.point.x+'<br/><span style="color:green;"><b>Cumul: </b></span>'+ Highcharts.numberFormat(this.point.y, 0) ;
			                 }
			            },
			            credits : {
			                enabled : false}
			            ,
			            
			            legend: {
			                layout: 'vertical',
			                align: 'right',
			                verticalAlign: 'top',
			                x: -10,
			                y: 100,					
							
			                borderWidth: 0
			            },
			            series: [{
			            	showInLegend: false,
			                name: 'Cumul',
			                data: data,
			                color: color
			            }]
			        });
			    });
			}
			

alert("fin javascript");