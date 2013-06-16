function createBarsChart(id,title,year,color,categories,values){
	
	
	$(function () {
        $(id).highcharts({
            chart: {
                type: 'bar'
            },
            title: {
                text: title
            },
            subtitle: {
                text: 'Year: '+year
            },
            xAxis: {
                categories: categories,
                title: {
                    text: null
                },
                labels: {
                	overflow: 'justify',
                    formatter: function() {
                    	return this.value.substr( this.value.indexOf(";")+1,this.value.length);
                    }
                }
            },
            yAxis: {
                min: 0,
                title: {
                    text: 'DSO (days)',
                    align: 'high'
                },
                labels: {
                    overflow: 'justify'
                }
            },
            tooltip: {
            	useHTML: true,
            	formatter: function() {
            	    return  this.x.substr( 0,this.x.indexOf(";")) +
            	    	'<br/> <b>DSO</b>: '+ Highcharts.numberFormat(this.y, 0) ;
            	  }
            },
            plotOptions: {
                bar: {
                    dataLabels: {
                        enabled: true,
                        formatter: function() {
                        	return Highcharts.numberFormat(this.y, 0);
                        }
                    }
                }
            },
            legend: {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'top',
                x: -100,
                y: 100,
                floating: true,
                borderWidth: 1,
                backgroundColor: '#FFFFFF',
                shadow: true
            },
            credits: {
                enabled: false
            },
            series: [{
            	showInLegend: false,
                data: values,
                color: color
            }]
        });
    });
}