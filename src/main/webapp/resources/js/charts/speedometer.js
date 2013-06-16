
function createSpeedometer(id,title,value){
	
	var value_r = Math.round(value);
	var max_value;
	if(Math.abs(value_r) <= 100)
		max_value = 100;
	else
		max_value = Math.abs(value_r);

	$(function () {
	    $(id).highcharts({
		
		    chart: {
		        type: 'gauge',
		        plotBackgroundColor: null,
		        plotBackgroundImage: null,
		        plotBorderWidth: 0,
		        plotShadow: false
		    },
		    
		    title: {
		        text: title
		    },
		    credits: {
                enabled: false
            },
		    pane: {
		        startAngle: -150,
		        endAngle: 150,
		        background: [{
		            backgroundColor: {
		                linearGradient: { x1: 0, y1: 0, x2: 0, y2: 1 },
		                stops: [
		                    [0, '#FFF'],
		                    [1, '#333']
		                ]
		            },
		            borderWidth: 0,
		            outerRadius: '109%'
		        }, {
		            backgroundColor: {
		                linearGradient: { x1: 0, y1: 0, x2: 0, y2: 1 },
		                stops: [
		                    [0, '#333'],
		                    [1, '#FFF']
		                ]
		            },
		            borderWidth: 1,
		            outerRadius: '107%'
		        }, {
		            // default background
		        }, {
		            backgroundColor: '#DDD',
		            borderWidth: 0,
		            outerRadius: '105%',
		            innerRadius: '103%'
		        }]
		    },
		       
		    // the value axis
		    yAxis: {
		        min: -max_value,
		        max: max_value,
		        
		        minorTickInterval: 'auto',
		        minorTickWidth: 1,
		        minorTickLength: 10,
		        minorTickPosition: 'inside',
		        minorTickColor: '#666',
		
		        tickPixelInterval: 30,
		        tickWidth: 2,
		        tickPosition: 'inside',
		        tickLength: 10,
		        tickColor: '#666',
		        labels: {
		            step: 2,
		            rotation: 'auto'
		        },
		        title: {
		            text: '%'
		        },
		        plotBands: [{
		            from: -max_value,
		            to: 0,
		            color: '#DF5353' // red '#55BF3B' // green
		        }, {
		            from: 0,
		            to: 20,
		            color: '#DDDF0D' // yellow  '#DDDF0D' // yellow
		        }, {
		            from: 20,
		            to: max_value,
		            color: '#55BF3B' // green   '#DF5353' // red
		        }]        
		    },
		    tooltip: {
	            formatter: function() {
                	return '<b>Growth: </b>' +Math.round(this.y) + '%';
                }
	        },
		    series: [{
		        data: [value_r]
		        
		    }]
		
		});
	});
}
			

//alert("fin speedometer.js");