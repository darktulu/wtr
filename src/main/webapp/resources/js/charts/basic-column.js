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
			                    return this.x+'<br/><span style="color:green;"><b>Cumul: </b></span>'+ Highcharts.numberFormat(this.point.y, 0) ;
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

function createColumnChart(id,title,year,color,categories,values){
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
                categories: categories,
                labels: {
                	rotation: -45,
                	style: {
                        fontSize: '10pxtitle'
                	},
                	overflow: 'justify',
                    formatter: function() {
                    	return this.value.substr( this.value.indexOf(";")+1,this.value.length);
                    }
                }
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
            	useHTML: true,
            	formatter: function() {
            	    return  this.x.substr( 0,this.x.indexOf(";")) +
            	    	'<br/> <b>Value</b>: '+ Highcharts.numberFormat(this.y, 0) ;
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
                data: values,
                color: color
            }]
        });
    });
}

function createColumnChartAvatar(id,title,year,color,categories,values){
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
                categories: categories,
                labels: {
                	rotation: -45,
                	style: {
                        fontSize: '10pxtitle'
                	},
                	overflow: 'justify',
                    formatter: function() {
                    	return this.value.substr( this.value.indexOf(";")+1,this.value.length);
                    }
                }
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
            	useHTML: true,
            	formatter: function() {
            		 return '<div style="height:150px;width:200px;"><div><br/> <center><img width="50px" height="50px" src="photos/'
	                    +this.x.substr( this.x.indexOf(";")+1,this.x.length)
	                    +'.jpg" alt="PM avatar"/> </center><br/></div>'
	                    +'<div style="margin:10px;margin-left:20px;"><b>'+ this.x.substr( 0,this.x.indexOf(";")) 
            	    	+'<br/> <b>Value</b>: '+ Highcharts.numberFormat(this.y, 0)
            	    	+'</div></div>'
            	    	;
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
                data: values,
                color: color
            }]
        });
    });
}

function createStackedColumn(id,title,year,data1,data2,data3){
	$(function () {
        $(id).highcharts({
            chart: {
                type: 'column'
            },
            title: {
                text: title
            },
            xAxis: {
            	categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun','Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
            },
            yAxis: {
                min: 0,
                title: {
                    text: 'Total Costs (MAD)'
                }
            },
            legend: {
                align: 'right',
                x: -100,
                verticalAlign: 'top',
                y: 20,
                floating: true,
                backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColorSolid) || 'white',
                borderColor: '#CCC',
                borderWidth: 1,
                shadow: false
            },
            tooltip: {
                formatter: function() {
                    return '<b>'+ this.x +'</b><br/>'+
                        this.series.name +': '+ this.y +'<br/>'+
                        'Total: '+ this.point.stackTotal;
                }
            },
            credits : {
                enabled : false}
            ,
            plotOptions: {
                column: {
                    stacking: 'normal',
                    dataLabels: {
                        enabled: false
                    }
                }
            },
            series: [{
                name: 'Ibuy',
                data: data1
            }, {
                name: 'Iexpenses',
                data: data2
            }, {
                name: 'Payroll',
                data: data3
            }]
        });
    });
}
			