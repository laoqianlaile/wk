'use strict';define("dojo/_base/declare dojo/_base/lang dojo/_base/html ./../../echartsCommon ./../../BaseWidget dojo/text!./Widget3.html".split(" "),function(b,g,c,a,d,e){var f={title:a.getTitle("\u56fa\u5b9a\u8d44\u4ea7\u6295\u8d44\u884c\u4e1a\u5bf9\u6bd4"),tooltip:{position:"right",formatter:"{b}: {c}\u4ebf\u5143"},series:[{type:"pie",radius:["35%","50%"],center:["50%","52%"],label:a.getPie2("label"),labelLine:a.getPie2("labelLine"),startAngle:340,minAngle:30,data:[{value:48.9488,name:"\u7b2c\u4e00\u4ea7\u4e1a"},{value:2334.6755,name:"\u7b2c\u4e8c\u4ea7\u4e1a"},{value:1882.4923,name:"\u7b2c\u4e09\u4ea7\u4e1a"}]}],color:["#FFDE1A","#F5832A","#8BCC6E"]};return b([d],{baseClass:"widget1",templateString:e,postCreate:function(){},startup:function(){this.chart=echarts.init(this.chartNode);this.chart.setOption(f);this.setAnnex()},setAnnex:function(){var a=c.getContentBox(this.domNode);console.log(a.height+a.width)}})});