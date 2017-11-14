package bean;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * 1.类的用途
 * 2.@author:zhanghaisheng
 * 3.@2017/11/13
 */


public class Bean {


    /**
     * status : true
     * result : {"title":"猜你喜欢","total":"29","rows":[{"fang_type":"xinfang","info":{"loupan_id":"250211","loupan_name":"首开香溪郡","city_id":"14","new_price_value":"400","new_price_back":"万元/套起","price":0,"region_id":"818","region_title":"通州","sub_region_id":"5397","sub_region_title":"宋庄","default_image":"http://pic2.ajkimg.com/display/xinfang/f8f0e165b85a451848b906e4bd9221dc/275x206n.jpg?t=5","address":"东北五环通顺路与窑管路交口西侧(东坝向东八公里)","activity_tags_icon":[],"show_activity":{"title":"建筑面积 90-105㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"河景,大阳台,大平层,五环至六环,大主卧","status_sale":"4","has_sale":0,"lat":"40.008691","lng":"116.669762","baidu_lat":"40.013746","baidu_lng":"116.678723","kaipan_new_date":"2017-11-04","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"279332㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"通州洋房二到四居珍藏入市"}]}},{"fang_type":"xinfang","info":{"loupan_id":"417711","loupan_name":"首开住总熙悦安郡","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"642","region_title":"朝阳","sub_region_id":"670","sub_region_title":"小红门","default_image":"http://pic2.ajkimg.com/display/xinfang/f3227da3daba876e265091469c4bb175/275x206n.jpg?t=5","address":"朝阳区成寿寺路甲137号","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,改善房,双阳台,三环至四环,大型超市","status_sale":"7","has_sale":0,"lat":"39.835993","lng":"116.442759","baidu_lat":"39.841775255416","baidu_lng":"116.44932908951","kaipan_new_date":"2017-11-31","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"234738㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"首开熙悦系全新超越之作"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}]}},{"fang_type":"xinfang","info":{"loupan_id":"240383","loupan_name":"永定河孔雀城空港壹号街区","city_id":"14","new_price_value":"14500","new_price_back":"元/㎡","price":14500,"region_id":"8663","region_title":"固安","sub_region_id":"2681","sub_region_title":"固安","default_image":"http://pic2.ajkimg.com/display/xinfang/0c590a76dcaf40169ae7f20f3bc15939/275x206n.jpg?t=5","address":"大广高速路旁，迎宾大道和工兴路交叉口","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/346bf7e5d27682aaa4742556cac49eba/.jpg.bcc67842b3869c11d539ffc0d5109dbe.jpg"],"show_activity":{"title":"新空港商务区","color":"#e54b00"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"商业","tags":"景区,六环以外,公园,美食街,医院","status_sale":"3","has_sale":0,"lat":"39.424141","lng":"116.283367","baidu_lat":"39.430483061317","baidu_lng":"116.28974648555","kaipan_new_date":"2017-09-16","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang_rec","multi_image":["http://pic2.ajkimg.com/display/xinfang/be32d6179d3158de2a4d1884e0456dd7/275x206n.jpg","http://pic2.ajkimg.com/display/xinfang/eb3c57e0b22c4c6c83b072c84e2f6a70/275x206n.jpg","http://pic2.ajkimg.com/display/xinfang/bf0e66d1a773c8e6664aaab1c453a8bd/275x206n.jpg"],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":" 279000㎡","activity":[{"type":"re","icon":"http://pic1.ajkimg.com/material/get/4bf264f154622a6044aa28c5c7c261dd.png","title":"新空港商务区"},{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"38-90㎡空港SOHO均14000-15000元/㎡"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"417828","loupan_name":"万科大都会滨江","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"818","region_title":"通州","sub_region_id":"835","sub_region_title":"运河核心区","default_image":"http://pic2.ajkimg.com/display/xinfang/d46abf349454422ddd33a0a0240f873e/275x206n.jpg?t=5","address":"地铁6号线通州北关站北侧500米","activity_tags_icon":[],"show_activity":{},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"商务公寓","tags":"轨交房,广场,美食街,五环至六环,品牌开发商","status_sale":"7","has_sale":0,"lat":"39.924051","lng":"116.659235","baidu_lat":"39.9299","baidu_lng":"116.665442","kaipan_new_date":"","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"117609㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"璀璨都会，即将揭幕！"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"252254","loupan_name":"上林溪南区","city_id":"14","new_price_value":"80000","new_price_back":"元/㎡","price":80000,"region_id":"601","region_title":"海淀","sub_region_id":"616","sub_region_title":"上地","default_image":"http://pic2.ajkimg.com/display/xinfang/9508da961061a6ec794538fc5f0cfe4a/275x206n.jpg?t=5","address":"上地桥东","activity_tags_icon":[],"show_activity":{"title":"建筑面积 44-108㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"公交枢纽,五环至六环,小户型,银行,改善房","status_sale":"4","has_sale":0,"lat":"40.046893","lng":"116.326471","baidu_lat":"40.052524","baidu_lng":"116.333049","kaipan_new_date":"2017-08-05","activity_tags":{},"has_consultant":0,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"300000㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"412682","loupan_name":"亿城国际中心上地园","city_id":"14","new_price_value":"45000","new_price_back":"元/㎡","price":45000,"region_id":"601","region_title":"海淀","sub_region_id":"616","sub_region_title":"上地","default_image":"http://pic2.ajkimg.com/display/xinfang/b74b619e140e285e3a030f446e9ca661/275x206n.jpg?t=5","address":"海淀上地环岛西侧 马连洼北路与竹园中街交汇处","activity_tags_icon":[],"show_activity":{},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"办公楼","tags":"轨交房,公园,公交枢纽,五环至六环,投资地产","status_sale":"4","has_sale":0,"lat":"40.033415","lng":"116.282841","baidu_lat":"40.039541","baidu_lng":"116.289216","kaipan_new_date":"2013-08-24","activity_tags":{},"has_consultant":0,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"45090㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"429181","loupan_name":"金樾和著","city_id":"14","new_price_value":"38994","new_price_back":"元/㎡","price":38994,"region_id":"802","region_title":"房山","sub_region_id":"805","sub_region_title":"良乡","default_image":"http://pic2.ajkimg.com/display/xinfang/d83cb067db936a835793ad52b5e6b21d/275x206n.jpg?t=5","address":"良乡镇","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,大型社区,五环至六环,品牌开发商,大型超市","status_sale":"7","has_sale":0,"lat":"39.723477","lng":"116.123187","baidu_lat":"39.729779","baidu_lng":"116.129685","kaipan_new_date":"","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"133361㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"四雄布局京西南金樾和著坐享其城"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416443","loupan_name":"湖光壹号","city_id":"14","new_price_value":"90000","new_price_back":"元/㎡","price":90000,"region_id":"642","region_title":"朝阳","sub_region_id":"646","sub_region_title":"望京","default_image":"http://pic2.ajkimg.com/display/xinfang/52ac41688e7c2d32f6d6007d14e44948/275x206n.jpg?t=5","address":"京承高速与北四环路交接处以东","activity_tags_icon":[],"show_activity":{"title":"建筑面积 183-226㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,高尔夫球场,四环至五环,人车分流,公园","status_sale":"3","has_sale":0,"lat":"39.997891","lng":"116.454219","baidu_lat":"40.003563470176","baidu_lng":"116.46085086167","kaipan_new_date":"2016-09-10","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"155450.01㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"湖光壹号望京华府183-387㎡阔景大宅"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"411871","loupan_name":"中海墅","city_id":"14","new_price_value":"60000","new_price_back":"元/㎡","price":60000,"region_id":"865","region_title":"大兴","sub_region_id":"868","sub_region_title":"亦庄","default_image":"http://pic2.ajkimg.com/display/xinfang/906dd17e64ff963a75981a4cf26bd15e/275x206n.jpg?t=5","address":"三海子东路","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/567db4dd8a30ed1b12f8d81eb6561067/.jpg.95cd544e74bc1c615e94309000cb6c04.jpg"],"show_activity":{"title":"全款99折","color":"#e54b00","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"改善房,高尔夫球场,公园,大阳台,大主卧","status_sale":"3","has_sale":0,"lat":"39.7875443548","lng":"116.4710639332","baidu_lat":"39.793323","baidu_lng":"116.477653","kaipan_new_date":"2017-08-27","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"126000.00㎡","activity":[{"type":"hui","icon":"http://pic1.ajkimg.com/material/get/8654d43460b906afd0355d73a3fb86ec.png","title":"全款99折"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"415528","loupan_name":"富龙四季小镇","city_id":"14","new_price_value":"23000","new_price_back":"元/㎡","price":23000,"region_id":"8669","region_title":"投资","sub_region_id":"5095","sub_region_title":"投资","default_image":"http://pic2.ajkimg.com/display/xinfang/7d0b1e05de8cf80cec97e0c7fb9e3c3c/275x206n.jpg?t=5","address":"张家口市崇礼区万龙路口南（汤inn温泉假日酒店南侧）","activity_tags_icon":[],"show_activity":{"title":"按揭98折，全款95折优惠","color":"#e54b00"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"酒店式公寓,温泉入户,六环以外,旅游地产,大型社区","status_sale":"3","has_sale":0,"lat":"40.644779","lng":"116.638791","baidu_lat":"40.980984","baidu_lng":"115.288897","kaipan_new_date":"2016-12-18","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"148339㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"金秋好礼，购房超值惊喜"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"426677","loupan_name":"空港壹号街区","city_id":"14","new_price_value":"13500","new_price_back":"元/㎡","price":13500,"region_id":"8663","region_title":"固安","sub_region_id":"2681","sub_region_title":"固安","default_image":"http://pic2.ajkimg.com/display/xinfang/fe0ac107ddfb1d0400c2e5da05bfdd5c/275x206n.jpg?t=5","address":"迎宾大道与工兴路南交口（紧邻大广高速二出口）","activity_tags_icon":[],"show_activity":{"title":"认购99折，按时签约折上99折","color":"#e54b00"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"商业","tags":"六环以外,公园,商场,医院,银行","status_sale":"3","has_sale":0,"lat":"39.424219","lng":"116.279381","baidu_lat":"39.429619","baidu_lng":"116.286369","kaipan_new_date":"2017-09-17","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"279000㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"大都会综合体38-90㎡空港soho全系登场"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"408581","loupan_name":"首开华润城","city_id":"14","new_price_value":"90000","new_price_back":"元/㎡","price":90000,"region_id":"753","region_title":"丰台","sub_region_id":"769","sub_region_title":"科技园区","default_image":"http://pic2.ajkimg.com/display/xinfang/ce4d13a92fca3b936b71ce7d18dc595b/275x206n.jpg?t=5","address":"樊羊路,近六圈路","activity_tags_icon":[],"show_activity":{"title":"建筑面积 136-141㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,四环至五环,公园,大型超市,医院","status_sale":"3","has_sale":0,"lat":"39.820896387","lng":"116.3153698907","baidu_lat":"39.826787","baidu_lng":"116.321895","kaipan_new_date":"2016-07-10","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"122000.00㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"431324","loupan_name":"尚峯壹號","city_id":"14","new_price_value":"45000","new_price_back":"元/㎡","price":45000,"region_id":"837","region_title":"顺义","sub_region_id":"838","sub_region_title":"温榆河","default_image":"http://pic2.ajkimg.com/display/xinfang/4bc0481437ca1274dbffba7a97364add/275x206n.jpg","address":"京承高速11出口处","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/567db4dd8a30ed1b12f8d81eb6561067/.jpg.95cd544e74bc1c615e94309000cb6c04.jpg"],"show_activity":{"title":"特惠666万元","color":"#e54b00","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"办公楼","tags":"","status_sale":"4","has_sale":0,"lat":"40.212032","lng":"116.509954","baidu_lat":"40.217553","baidu_lng":"116.512404","kaipan_new_date":"2016-07-30","activity_tags":{},"has_consultant":0,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"225495.39㎡","activity":[{"type":"hui","icon":"http://pic1.ajkimg.com/material/get/8654d43460b906afd0355d73a3fb86ec.png","title":"特惠666万元"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416998","loupan_name":"中粮天恒天悦壹号","city_id":"14","new_price_value":"1000","new_price_back":"万元/套起","price":0,"region_id":"753","region_title":"丰台","sub_region_id":"5395","sub_region_title":"公益西桥","default_image":"http://pic2.ajkimg.com/display/xinfang/17aac5bedab2445e8de9b3ee684613f1/275x206n.jpg?t=5","address":"南四环地铁新宫站南500米","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"四环至五环,公园,美食街,轨交房,品牌开发商","status_sale":"3","has_sale":0,"lat":"39.803717","lng":"116.364644","baidu_lat":"39.811374","baidu_lng":"116.372848","kaipan_new_date":"2017-08-18","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"232965㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"中粮天恒·天悦壹号四环城市院落"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"240044","loupan_name":"首开国风美唐","city_id":"14","new_price_value":"56000","new_price_back":"元/㎡起","price":0,"region_id":"843","region_title":"昌平","sub_region_id":"850","sub_region_title":"霍营","default_image":"http://pic2.ajkimg.com/display/xinfang/4d0572c8d4630df1da629215fcdb491c/275x206n.jpg","address":"地铁8号线或13号线霍营站北侧300米（昌平区科星西路）","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,公园,五环至六环,大主卧,小户型","status_sale":"3","has_sale":0,"lat":"40.077177","lng":"116.361391","baidu_lat":"40.084935","baidu_lng":"116.364648","kaipan_new_date":"2017-07-23","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"216630㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"北五环地铁现房单价56000元/㎡起"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416735","loupan_name":"涿州孔雀城悦澜湾","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"8668","region_title":"涿州","sub_region_id":"2682","sub_region_title":"涿州","default_image":"http://pic2.ajkimg.com/display/xinfang/a5158e556f09b392796fa34f5437faba/275x206n.jpg?t=5","address":"涿州市永济公园西南200米","activity_tags_icon":[],"show_activity":{"title":"建筑面积 82-148㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,婚房,广场,大型社区,公园","status_sale":"7","has_sale":0,"lat":"39.511357","lng":"115.98013","baidu_lat":"39.517015500645","baidu_lng":"115.98676741462","kaipan_new_date":"","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{"front":"周边","value":13286,"back":"元/m²","toast":"根据本楼盘往期开盘均价、同区域板块在售新房均价、同区域板块二手房指导均价，通过安居客大数据运算，形成价格参考。楼盘实际售价以开发商取得\u201c预售许可证\u201d后的实际开盘价格为准。"},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"479800㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"新盘首开启幕湿地公园生活"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416061","loupan_name":"北京金茂府","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"753","region_title":"丰台","sub_region_id":"763","sub_region_title":"刘家窑","default_image":"http://pic2.ajkimg.com/display/xinfang/6ac7bfb385ce1f67555f6ac9ace994f7/275x206n.jpg?t=5","address":"宋家庄地铁站向南200米","activity_tags_icon":[],"show_activity":{"title":"建筑面积 198-337㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,公园,美食街,品牌开发商,三环至四环","status_sale":"7","has_sale":0,"lat":"39.841143","lng":"116.429204","baidu_lat":"39.846923","baidu_lng":"116.435049","kaipan_new_date":"2017-09-01","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"170000㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"600万三环金茂府新品入市"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"249303","loupan_name":"亦庄金茂府","city_id":"14","new_price_value":"880","new_price_back":"万元/套起","price":0,"region_id":"865","region_title":"大兴","sub_region_id":"868","sub_region_title":"亦庄","default_image":"http://pic2.ajkimg.com/display/xinfang/19268d086e6e5ff267b39da5dd6cd014/275x206n.jpg?t=5","address":"四海路","activity_tags_icon":[],"show_activity":{"title":"建筑面积 130-210㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"公园,五环至六环,品牌开发商,大型超市,双卫","status_sale":"3","has_sale":0,"lat":"39.75455","lng":"116.484127","baidu_lat":"39.760411","baidu_lng":"116.490669","kaipan_new_date":"2017-06-26","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"672565.00㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"140-210㎡科技四居现房加推"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"253050","loupan_name":"V7荷塘月色","city_id":"14","new_price_value":"550","new_price_back":"万元/套起","price":0,"region_id":"802","region_title":"房山","sub_region_id":"804","sub_region_title":"琉璃河","default_image":"http://pic2.ajkimg.com/display/xinfang/0a93df2483f85e73a72dec7ac0dd7f5b/275x206n.jpg?t=5","address":"白云路","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/567db4dd8a30ed1b12f8d81eb6561067/.jpg.95cd544e74bc1c615e94309000cb6c04.jpg"],"show_activity":{"title":"贷款99一次性98","color":"#e54b00","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"别墅","tags":"六环以外,大型社区,使用面积多,品牌开发商,景区","status_sale":"3","has_sale":0,"lat":"39.57865","lng":"115.890863","baidu_lat":"39.58466","baidu_lng":"115.897341","kaipan_new_date":"2016-08-27","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"95607.00㎡","activity":[{"type":"hui","icon":"http://pic1.ajkimg.com/material/get/8654d43460b906afd0355d73a3fb86ec.png","title":"贷款99一次性98"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"418474","loupan_name":"K2十里春风","city_id":"14","new_price_value":"37000","new_price_back":"元/㎡起","price":0,"region_id":"818","region_title":"通州","sub_region_id":"835","sub_region_title":"运河核心区","default_image":"http://pic2.ajkimg.com/display/xinfang/59d70ffc1e53f84a0e6ce5816d253af2/275x206n.jpg?t=5","address":"永乐经济开发区小甸屯村百莱玛工业园对面","activity_tags_icon":[],"show_activity":{"title":"建筑面积 78-155㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,品牌开发商,人车分流,景观小区,车位充足","status_sale":"3","has_sale":0,"lat":"39.630724","lng":"116.812182","baidu_lat":"39.636408937398","baidu_lng":"116.81880999492","kaipan_new_date":"2017-11-01","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"436188.20㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"K2系产品升级之作，新中式建筑"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"253207","loupan_name":"圣拉斐尔小镇东区","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"16185","region_title":"大厂","sub_region_id":"16186","sub_region_title":"大厂","default_image":"http://pic2.ajkimg.com/display/xinfang/711372ef6dc37cf88040a514fec904fb/275x206n.jpg?t=5","address":"102国道与福喜路交叉口南行第三个丁字路口左转500米","activity_tags_icon":[],"show_activity":{"title":"建筑面积 125-127㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,养老房,婚房,投资地产,商场","status_sale":"3","has_sale":0,"lat":"39.932488","lng":"116.921074","baidu_lat":"39.938372","baidu_lng":"116.929328","kaipan_new_date":"2017-06-01","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"917802.5㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"北京东，心之所往的风情墅镇"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"412674","loupan_name":"文化都汇","city_id":"14","new_price_value":"33000","new_price_back":"元/㎡起","price":0,"region_id":"865","region_title":"大兴","sub_region_id":"867","sub_region_title":"黄村","default_image":"http://pic2.ajkimg.com/display/xinfang/c60b927a578bb463983dabf3618d3d12/275x206n.jpg?t=5","address":"南五环外金星桥东侧金苑路与广阳大街交汇处","activity_tags_icon":[],"show_activity":{},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"办公楼","tags":"科技住宅,人车分流,车位充足,公交枢纽,投资地产","status_sale":"4","has_sale":0,"lat":"39.759818","lng":"116.357449","baidu_lat":"39.765659","baidu_lng":"116.362641","kaipan_new_date":"2016-06-26","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"137588㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"北京向南看文化地标文化都汇"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"431210","loupan_name":"中海·国际城","city_id":"14","new_price_value":"300","new_price_back":"万元/套起","price":0,"region_id":"837","region_title":"顺义","sub_region_id":"839","sub_region_title":"顺义城","default_image":"http://pic2.ajkimg.com/display/xinfang/3933d3fc3b0dfc0072b93f6db4f763f6/275x206n.jpg?t=5","address":"燕京桥西南角，石门地铁站南1200米","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"学校,六环以外,使用面积多,公交枢纽,大客厅","status_sale":"4","has_sale":0,"lat":"40.115565","lng":"116.638713","baidu_lat":"40.121948","baidu_lng":"116.645322","kaipan_new_date":"2016-12-11","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"91000㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"望京东北15号线旁瞰景高层"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"249121","loupan_name":"景粼原著","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"642","region_title":"朝阳","sub_region_id":"16657","sub_region_title":"孙河","default_image":"http://pic2.ajkimg.com/display/xinfang/c23df67e7a51b09732a86ce3e475bd68/275x206n.jpg?t=5","address":"京密路与顺黄路交叉路口往西200米","activity_tags_icon":[],"show_activity":{},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"低密度,五环至六环,人车分流,高端会所,银行","status_sale":"7","has_sale":0,"lat":"40.053537","lng":"116.523973","baidu_lat":"40.059624","baidu_lng":"116.530476","kaipan_new_date":"2017-10-28","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{"front":"周边","value":63649,"back":"元/m²","toast":"根据本楼盘往期开盘均价、同区域板块在售新房均价、同区域板块二手房指导均价，通过安居客大数据运算，形成价格参考。楼盘实际售价以开发商取得\u201c预售许可证\u201d后的实际开盘价格为准。"},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"100000㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416361","loupan_name":"中铁华侨城和园","city_id":"14","new_price_value":"800","new_price_back":"万元/套起","price":0,"region_id":"865","region_title":"大兴","sub_region_id":"869","sub_region_title":"旧宫","default_image":"http://pic2.ajkimg.com/display/xinfang/1c42035944c5a3025038914e7ac8c02e/275x206n.jpg?t=5","address":"公园北环路","activity_tags_icon":[],"show_activity":{"title":"建筑面积 121-139㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"公园,五环至六环,商场,医院,银行","status_sale":"3","has_sale":0,"lat":"39.789169","lng":"116.456609","baidu_lat":"39.794822","baidu_lng":"116.463218","kaipan_new_date":"2018-05-31","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":1,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"165765.00㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"121-139㎡全智能雅艺大宅劲销全城"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"412544","loupan_name":"泽信公馆","city_id":"14","new_price_value":"960","new_price_back":"万元/套起","price":0,"region_id":"753","region_title":"丰台","sub_region_id":"769","sub_region_title":"科技园区","default_image":"http://pic2.ajkimg.com/display/xinfang/d98ce29799e87acd57b77f426c851a94/275x206n.jpg?t=5","address":"看丹路","activity_tags_icon":[],"show_activity":{"title":"建筑面积 103-142㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,四环至五环,公交枢纽,大主卧,大客厅","status_sale":"3","has_sale":0,"lat":"39.8387","lng":"116.282683","baidu_lat":"39.845044","baidu_lng":"116.289051","kaipan_new_date":"2017-05-10","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"80640.00㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"252145","loupan_name":"碧桂园官厅湖","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"8669","region_title":"投资","sub_region_id":"16668","sub_region_title":"张家口","default_image":"http://pic2.ajkimg.com/display/xinfang/9b4c133d2c5528a45cb26976d515d104/275x206n.jpg?t=5","address":"怀来八达岭高速东花园出口西南方向9公里小南辛堡镇碧桂园官厅湖项目","activity_tags_icon":[],"show_activity":{"title":"建筑面积 77-398㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,使用面积多,全朝南,投资地产,露台","status_sale":"7","has_sale":0,"lat":"40.303878","lng":"115.678153","baidu_lat":"40.321929","baidu_lng":"115.681167","kaipan_new_date":"","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{"front":"周边","value":14400,"back":"元/m²","toast":"根据本楼盘往期开盘均价、同区域板块在售新房均价、同区域板块二手房指导均价，通过安居客大数据运算，形成价格参考。楼盘实际售价以开发商取得\u201c预售许可证\u201d后的实际开盘价格为准。"},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"110502㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"411083","loupan_name":"北京壹号院","city_id":"14","new_price_value":"170000","new_price_back":"元/㎡","price":170000,"region_id":"642","region_title":"朝阳","sub_region_id":"10263","sub_region_title":"三里屯","default_image":"http://pic2.ajkimg.com/display/xinfang/f4e79d8b292d1faf66e6ef35f66ec91b/275x206n.jpg?t=5","address":"农展北路8号","activity_tags_icon":[],"show_activity":{"title":"建筑面积 263-299㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,大平层,三环至四环,大型超市,运动健身","status_sale":"3","has_sale":0,"lat":"39.942542","lng":"116.468579","baidu_lat":"39.948223","baidu_lng":"116.475172","kaipan_new_date":"2015-05","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"59152.00㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"414344","loupan_name":"碧桂园莫奈的湖","city_id":"14","new_price_value":"12000","new_price_back":"元/㎡","price":12000,"region_id":"8672","region_title":"武清","sub_region_id":"8673","sub_region_title":"武清","default_image":"http://pic2.ajkimg.com/display/xinfang/21d5f249c59bdd588243dc44ccda3267/275x206n.jpg?t=5","address":"梅上新区杨六路东段","activity_tags_icon":[],"show_activity":{"title":"建筑面积 86-174㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,公园,山景,美食街,银行","status_sale":"3","has_sale":0,"lat":"39.417412","lng":"117.154622","baidu_lat":"39.423328632645","baidu_lng":"117.16115290013","kaipan_new_date":"2017-05-01","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"219643㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}}],"next_page":1}
     */

    private String status;
    private ResultBean result;

    public static Bean objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, Bean.class);
    }

    public static Bean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), Bean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * title : 猜你喜欢
         * total : 29
         * rows : [{"fang_type":"xinfang","info":{"loupan_id":"250211","loupan_name":"首开香溪郡","city_id":"14","new_price_value":"400","new_price_back":"万元/套起","price":0,"region_id":"818","region_title":"通州","sub_region_id":"5397","sub_region_title":"宋庄","default_image":"http://pic2.ajkimg.com/display/xinfang/f8f0e165b85a451848b906e4bd9221dc/275x206n.jpg?t=5","address":"东北五环通顺路与窑管路交口西侧(东坝向东八公里)","activity_tags_icon":[],"show_activity":{"title":"建筑面积 90-105㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"河景,大阳台,大平层,五环至六环,大主卧","status_sale":"4","has_sale":0,"lat":"40.008691","lng":"116.669762","baidu_lat":"40.013746","baidu_lng":"116.678723","kaipan_new_date":"2017-11-04","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"279332㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"通州洋房二到四居珍藏入市"}]}},{"fang_type":"xinfang","info":{"loupan_id":"417711","loupan_name":"首开住总熙悦安郡","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"642","region_title":"朝阳","sub_region_id":"670","sub_region_title":"小红门","default_image":"http://pic2.ajkimg.com/display/xinfang/f3227da3daba876e265091469c4bb175/275x206n.jpg?t=5","address":"朝阳区成寿寺路甲137号","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,改善房,双阳台,三环至四环,大型超市","status_sale":"7","has_sale":0,"lat":"39.835993","lng":"116.442759","baidu_lat":"39.841775255416","baidu_lng":"116.44932908951","kaipan_new_date":"2017-11-31","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"234738㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"首开熙悦系全新超越之作"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}]}},{"fang_type":"xinfang","info":{"loupan_id":"240383","loupan_name":"永定河孔雀城空港壹号街区","city_id":"14","new_price_value":"14500","new_price_back":"元/㎡","price":14500,"region_id":"8663","region_title":"固安","sub_region_id":"2681","sub_region_title":"固安","default_image":"http://pic2.ajkimg.com/display/xinfang/0c590a76dcaf40169ae7f20f3bc15939/275x206n.jpg?t=5","address":"大广高速路旁，迎宾大道和工兴路交叉口","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/346bf7e5d27682aaa4742556cac49eba/.jpg.bcc67842b3869c11d539ffc0d5109dbe.jpg"],"show_activity":{"title":"新空港商务区","color":"#e54b00"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"商业","tags":"景区,六环以外,公园,美食街,医院","status_sale":"3","has_sale":0,"lat":"39.424141","lng":"116.283367","baidu_lat":"39.430483061317","baidu_lng":"116.28974648555","kaipan_new_date":"2017-09-16","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang_rec","multi_image":["http://pic2.ajkimg.com/display/xinfang/be32d6179d3158de2a4d1884e0456dd7/275x206n.jpg","http://pic2.ajkimg.com/display/xinfang/eb3c57e0b22c4c6c83b072c84e2f6a70/275x206n.jpg","http://pic2.ajkimg.com/display/xinfang/bf0e66d1a773c8e6664aaab1c453a8bd/275x206n.jpg"],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":" 279000㎡","activity":[{"type":"re","icon":"http://pic1.ajkimg.com/material/get/4bf264f154622a6044aa28c5c7c261dd.png","title":"新空港商务区"},{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"38-90㎡空港SOHO均14000-15000元/㎡"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"417828","loupan_name":"万科大都会滨江","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"818","region_title":"通州","sub_region_id":"835","sub_region_title":"运河核心区","default_image":"http://pic2.ajkimg.com/display/xinfang/d46abf349454422ddd33a0a0240f873e/275x206n.jpg?t=5","address":"地铁6号线通州北关站北侧500米","activity_tags_icon":[],"show_activity":{},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"商务公寓","tags":"轨交房,广场,美食街,五环至六环,品牌开发商","status_sale":"7","has_sale":0,"lat":"39.924051","lng":"116.659235","baidu_lat":"39.9299","baidu_lng":"116.665442","kaipan_new_date":"","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"117609㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"璀璨都会，即将揭幕！"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"252254","loupan_name":"上林溪南区","city_id":"14","new_price_value":"80000","new_price_back":"元/㎡","price":80000,"region_id":"601","region_title":"海淀","sub_region_id":"616","sub_region_title":"上地","default_image":"http://pic2.ajkimg.com/display/xinfang/9508da961061a6ec794538fc5f0cfe4a/275x206n.jpg?t=5","address":"上地桥东","activity_tags_icon":[],"show_activity":{"title":"建筑面积 44-108㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"公交枢纽,五环至六环,小户型,银行,改善房","status_sale":"4","has_sale":0,"lat":"40.046893","lng":"116.326471","baidu_lat":"40.052524","baidu_lng":"116.333049","kaipan_new_date":"2017-08-05","activity_tags":{},"has_consultant":0,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"300000㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"412682","loupan_name":"亿城国际中心上地园","city_id":"14","new_price_value":"45000","new_price_back":"元/㎡","price":45000,"region_id":"601","region_title":"海淀","sub_region_id":"616","sub_region_title":"上地","default_image":"http://pic2.ajkimg.com/display/xinfang/b74b619e140e285e3a030f446e9ca661/275x206n.jpg?t=5","address":"海淀上地环岛西侧 马连洼北路与竹园中街交汇处","activity_tags_icon":[],"show_activity":{},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"办公楼","tags":"轨交房,公园,公交枢纽,五环至六环,投资地产","status_sale":"4","has_sale":0,"lat":"40.033415","lng":"116.282841","baidu_lat":"40.039541","baidu_lng":"116.289216","kaipan_new_date":"2013-08-24","activity_tags":{},"has_consultant":0,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"45090㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"429181","loupan_name":"金樾和著","city_id":"14","new_price_value":"38994","new_price_back":"元/㎡","price":38994,"region_id":"802","region_title":"房山","sub_region_id":"805","sub_region_title":"良乡","default_image":"http://pic2.ajkimg.com/display/xinfang/d83cb067db936a835793ad52b5e6b21d/275x206n.jpg?t=5","address":"良乡镇","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,大型社区,五环至六环,品牌开发商,大型超市","status_sale":"7","has_sale":0,"lat":"39.723477","lng":"116.123187","baidu_lat":"39.729779","baidu_lng":"116.129685","kaipan_new_date":"","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"133361㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"四雄布局京西南金樾和著坐享其城"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416443","loupan_name":"湖光壹号","city_id":"14","new_price_value":"90000","new_price_back":"元/㎡","price":90000,"region_id":"642","region_title":"朝阳","sub_region_id":"646","sub_region_title":"望京","default_image":"http://pic2.ajkimg.com/display/xinfang/52ac41688e7c2d32f6d6007d14e44948/275x206n.jpg?t=5","address":"京承高速与北四环路交接处以东","activity_tags_icon":[],"show_activity":{"title":"建筑面积 183-226㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,高尔夫球场,四环至五环,人车分流,公园","status_sale":"3","has_sale":0,"lat":"39.997891","lng":"116.454219","baidu_lat":"40.003563470176","baidu_lng":"116.46085086167","kaipan_new_date":"2016-09-10","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"155450.01㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"湖光壹号望京华府183-387㎡阔景大宅"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"411871","loupan_name":"中海墅","city_id":"14","new_price_value":"60000","new_price_back":"元/㎡","price":60000,"region_id":"865","region_title":"大兴","sub_region_id":"868","sub_region_title":"亦庄","default_image":"http://pic2.ajkimg.com/display/xinfang/906dd17e64ff963a75981a4cf26bd15e/275x206n.jpg?t=5","address":"三海子东路","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/567db4dd8a30ed1b12f8d81eb6561067/.jpg.95cd544e74bc1c615e94309000cb6c04.jpg"],"show_activity":{"title":"全款99折","color":"#e54b00","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"改善房,高尔夫球场,公园,大阳台,大主卧","status_sale":"3","has_sale":0,"lat":"39.7875443548","lng":"116.4710639332","baidu_lat":"39.793323","baidu_lng":"116.477653","kaipan_new_date":"2017-08-27","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"126000.00㎡","activity":[{"type":"hui","icon":"http://pic1.ajkimg.com/material/get/8654d43460b906afd0355d73a3fb86ec.png","title":"全款99折"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"415528","loupan_name":"富龙四季小镇","city_id":"14","new_price_value":"23000","new_price_back":"元/㎡","price":23000,"region_id":"8669","region_title":"投资","sub_region_id":"5095","sub_region_title":"投资","default_image":"http://pic2.ajkimg.com/display/xinfang/7d0b1e05de8cf80cec97e0c7fb9e3c3c/275x206n.jpg?t=5","address":"张家口市崇礼区万龙路口南（汤inn温泉假日酒店南侧）","activity_tags_icon":[],"show_activity":{"title":"按揭98折，全款95折优惠","color":"#e54b00"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"酒店式公寓,温泉入户,六环以外,旅游地产,大型社区","status_sale":"3","has_sale":0,"lat":"40.644779","lng":"116.638791","baidu_lat":"40.980984","baidu_lng":"115.288897","kaipan_new_date":"2016-12-18","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"148339㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"金秋好礼，购房超值惊喜"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"426677","loupan_name":"空港壹号街区","city_id":"14","new_price_value":"13500","new_price_back":"元/㎡","price":13500,"region_id":"8663","region_title":"固安","sub_region_id":"2681","sub_region_title":"固安","default_image":"http://pic2.ajkimg.com/display/xinfang/fe0ac107ddfb1d0400c2e5da05bfdd5c/275x206n.jpg?t=5","address":"迎宾大道与工兴路南交口（紧邻大广高速二出口）","activity_tags_icon":[],"show_activity":{"title":"认购99折，按时签约折上99折","color":"#e54b00"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"商业","tags":"六环以外,公园,商场,医院,银行","status_sale":"3","has_sale":0,"lat":"39.424219","lng":"116.279381","baidu_lat":"39.429619","baidu_lng":"116.286369","kaipan_new_date":"2017-09-17","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"279000㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"大都会综合体38-90㎡空港soho全系登场"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"408581","loupan_name":"首开华润城","city_id":"14","new_price_value":"90000","new_price_back":"元/㎡","price":90000,"region_id":"753","region_title":"丰台","sub_region_id":"769","sub_region_title":"科技园区","default_image":"http://pic2.ajkimg.com/display/xinfang/ce4d13a92fca3b936b71ce7d18dc595b/275x206n.jpg?t=5","address":"樊羊路,近六圈路","activity_tags_icon":[],"show_activity":{"title":"建筑面积 136-141㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,四环至五环,公园,大型超市,医院","status_sale":"3","has_sale":0,"lat":"39.820896387","lng":"116.3153698907","baidu_lat":"39.826787","baidu_lng":"116.321895","kaipan_new_date":"2016-07-10","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"122000.00㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"431324","loupan_name":"尚峯壹號","city_id":"14","new_price_value":"45000","new_price_back":"元/㎡","price":45000,"region_id":"837","region_title":"顺义","sub_region_id":"838","sub_region_title":"温榆河","default_image":"http://pic2.ajkimg.com/display/xinfang/4bc0481437ca1274dbffba7a97364add/275x206n.jpg","address":"京承高速11出口处","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/567db4dd8a30ed1b12f8d81eb6561067/.jpg.95cd544e74bc1c615e94309000cb6c04.jpg"],"show_activity":{"title":"特惠666万元","color":"#e54b00","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"办公楼","tags":"","status_sale":"4","has_sale":0,"lat":"40.212032","lng":"116.509954","baidu_lat":"40.217553","baidu_lng":"116.512404","kaipan_new_date":"2016-07-30","activity_tags":{},"has_consultant":0,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"225495.39㎡","activity":[{"type":"hui","icon":"http://pic1.ajkimg.com/material/get/8654d43460b906afd0355d73a3fb86ec.png","title":"特惠666万元"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416998","loupan_name":"中粮天恒天悦壹号","city_id":"14","new_price_value":"1000","new_price_back":"万元/套起","price":0,"region_id":"753","region_title":"丰台","sub_region_id":"5395","sub_region_title":"公益西桥","default_image":"http://pic2.ajkimg.com/display/xinfang/17aac5bedab2445e8de9b3ee684613f1/275x206n.jpg?t=5","address":"南四环地铁新宫站南500米","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"四环至五环,公园,美食街,轨交房,品牌开发商","status_sale":"3","has_sale":0,"lat":"39.803717","lng":"116.364644","baidu_lat":"39.811374","baidu_lng":"116.372848","kaipan_new_date":"2017-08-18","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"232965㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"中粮天恒·天悦壹号四环城市院落"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"240044","loupan_name":"首开国风美唐","city_id":"14","new_price_value":"56000","new_price_back":"元/㎡起","price":0,"region_id":"843","region_title":"昌平","sub_region_id":"850","sub_region_title":"霍营","default_image":"http://pic2.ajkimg.com/display/xinfang/4d0572c8d4630df1da629215fcdb491c/275x206n.jpg","address":"地铁8号线或13号线霍营站北侧300米（昌平区科星西路）","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,公园,五环至六环,大主卧,小户型","status_sale":"3","has_sale":0,"lat":"40.077177","lng":"116.361391","baidu_lat":"40.084935","baidu_lng":"116.364648","kaipan_new_date":"2017-07-23","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"216630㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"北五环地铁现房单价56000元/㎡起"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416735","loupan_name":"涿州孔雀城悦澜湾","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"8668","region_title":"涿州","sub_region_id":"2682","sub_region_title":"涿州","default_image":"http://pic2.ajkimg.com/display/xinfang/a5158e556f09b392796fa34f5437faba/275x206n.jpg?t=5","address":"涿州市永济公园西南200米","activity_tags_icon":[],"show_activity":{"title":"建筑面积 82-148㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,婚房,广场,大型社区,公园","status_sale":"7","has_sale":0,"lat":"39.511357","lng":"115.98013","baidu_lat":"39.517015500645","baidu_lng":"115.98676741462","kaipan_new_date":"","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{"front":"周边","value":13286,"back":"元/m²","toast":"根据本楼盘往期开盘均价、同区域板块在售新房均价、同区域板块二手房指导均价，通过安居客大数据运算，形成价格参考。楼盘实际售价以开发商取得\u201c预售许可证\u201d后的实际开盘价格为准。"},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"479800㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"新盘首开启幕湿地公园生活"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416061","loupan_name":"北京金茂府","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"753","region_title":"丰台","sub_region_id":"763","sub_region_title":"刘家窑","default_image":"http://pic2.ajkimg.com/display/xinfang/6ac7bfb385ce1f67555f6ac9ace994f7/275x206n.jpg?t=5","address":"宋家庄地铁站向南200米","activity_tags_icon":[],"show_activity":{"title":"建筑面积 198-337㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,公园,美食街,品牌开发商,三环至四环","status_sale":"7","has_sale":0,"lat":"39.841143","lng":"116.429204","baidu_lat":"39.846923","baidu_lng":"116.435049","kaipan_new_date":"2017-09-01","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"170000㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"600万三环金茂府新品入市"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"249303","loupan_name":"亦庄金茂府","city_id":"14","new_price_value":"880","new_price_back":"万元/套起","price":0,"region_id":"865","region_title":"大兴","sub_region_id":"868","sub_region_title":"亦庄","default_image":"http://pic2.ajkimg.com/display/xinfang/19268d086e6e5ff267b39da5dd6cd014/275x206n.jpg?t=5","address":"四海路","activity_tags_icon":[],"show_activity":{"title":"建筑面积 130-210㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"公园,五环至六环,品牌开发商,大型超市,双卫","status_sale":"3","has_sale":0,"lat":"39.75455","lng":"116.484127","baidu_lat":"39.760411","baidu_lng":"116.490669","kaipan_new_date":"2017-06-26","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"672565.00㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"140-210㎡科技四居现房加推"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"253050","loupan_name":"V7荷塘月色","city_id":"14","new_price_value":"550","new_price_back":"万元/套起","price":0,"region_id":"802","region_title":"房山","sub_region_id":"804","sub_region_title":"琉璃河","default_image":"http://pic2.ajkimg.com/display/xinfang/0a93df2483f85e73a72dec7ac0dd7f5b/275x206n.jpg?t=5","address":"白云路","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/567db4dd8a30ed1b12f8d81eb6561067/.jpg.95cd544e74bc1c615e94309000cb6c04.jpg"],"show_activity":{"title":"贷款99一次性98","color":"#e54b00","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"别墅","tags":"六环以外,大型社区,使用面积多,品牌开发商,景区","status_sale":"3","has_sale":0,"lat":"39.57865","lng":"115.890863","baidu_lat":"39.58466","baidu_lng":"115.897341","kaipan_new_date":"2016-08-27","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"95607.00㎡","activity":[{"type":"hui","icon":"http://pic1.ajkimg.com/material/get/8654d43460b906afd0355d73a3fb86ec.png","title":"贷款99一次性98"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"418474","loupan_name":"K2十里春风","city_id":"14","new_price_value":"37000","new_price_back":"元/㎡起","price":0,"region_id":"818","region_title":"通州","sub_region_id":"835","sub_region_title":"运河核心区","default_image":"http://pic2.ajkimg.com/display/xinfang/59d70ffc1e53f84a0e6ce5816d253af2/275x206n.jpg?t=5","address":"永乐经济开发区小甸屯村百莱玛工业园对面","activity_tags_icon":[],"show_activity":{"title":"建筑面积 78-155㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,品牌开发商,人车分流,景观小区,车位充足","status_sale":"3","has_sale":0,"lat":"39.630724","lng":"116.812182","baidu_lat":"39.636408937398","baidu_lng":"116.81880999492","kaipan_new_date":"2017-11-01","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"436188.20㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"K2系产品升级之作，新中式建筑"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"253207","loupan_name":"圣拉斐尔小镇东区","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"16185","region_title":"大厂","sub_region_id":"16186","sub_region_title":"大厂","default_image":"http://pic2.ajkimg.com/display/xinfang/711372ef6dc37cf88040a514fec904fb/275x206n.jpg?t=5","address":"102国道与福喜路交叉口南行第三个丁字路口左转500米","activity_tags_icon":[],"show_activity":{"title":"建筑面积 125-127㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,养老房,婚房,投资地产,商场","status_sale":"3","has_sale":0,"lat":"39.932488","lng":"116.921074","baidu_lat":"39.938372","baidu_lng":"116.929328","kaipan_new_date":"2017-06-01","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"917802.5㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"北京东，心之所往的风情墅镇"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"412674","loupan_name":"文化都汇","city_id":"14","new_price_value":"33000","new_price_back":"元/㎡起","price":0,"region_id":"865","region_title":"大兴","sub_region_id":"867","sub_region_title":"黄村","default_image":"http://pic2.ajkimg.com/display/xinfang/c60b927a578bb463983dabf3618d3d12/275x206n.jpg?t=5","address":"南五环外金星桥东侧金苑路与广阳大街交汇处","activity_tags_icon":[],"show_activity":{},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"办公楼","tags":"科技住宅,人车分流,车位充足,公交枢纽,投资地产","status_sale":"4","has_sale":0,"lat":"39.759818","lng":"116.357449","baidu_lat":"39.765659","baidu_lng":"116.362641","kaipan_new_date":"2016-06-26","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"137588㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"北京向南看文化地标文化都汇"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"431210","loupan_name":"中海·国际城","city_id":"14","new_price_value":"300","new_price_back":"万元/套起","price":0,"region_id":"837","region_title":"顺义","sub_region_id":"839","sub_region_title":"顺义城","default_image":"http://pic2.ajkimg.com/display/xinfang/3933d3fc3b0dfc0072b93f6db4f763f6/275x206n.jpg?t=5","address":"燕京桥西南角，石门地铁站南1200米","activity_tags_icon":["http://pic1.ajkimg.com/display/xinform/d89db6eef991ccf12c1171cd0ccccf31/.jpg.175ff64a4e77113c07f69ba0aed9b5c7.jpg"],"show_activity":{"title":"免费专车，随时看房","color":"#5aa600","icon_type":"3","icon":""},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"学校,六环以外,使用面积多,公交枢纽,大客厅","status_sale":"4","has_sale":0,"lat":"40.115565","lng":"116.638713","baidu_lat":"40.121948","baidu_lng":"116.645322","kaipan_new_date":"2016-12-11","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"91000㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"望京东北15号线旁瞰景高层"},{"type":"kan","icon":"http://pic1.ajkimg.com/material/get/55b2ea9ecebc324ebc7158eebd8422ef.png","title":"免费专车，随时看房"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"249121","loupan_name":"景粼原著","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"642","region_title":"朝阳","sub_region_id":"16657","sub_region_title":"孙河","default_image":"http://pic2.ajkimg.com/display/xinfang/c23df67e7a51b09732a86ce3e475bd68/275x206n.jpg?t=5","address":"京密路与顺黄路交叉路口往西200米","activity_tags_icon":[],"show_activity":{},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"低密度,五环至六环,人车分流,高端会所,银行","status_sale":"7","has_sale":0,"lat":"40.053537","lng":"116.523973","baidu_lat":"40.059624","baidu_lng":"116.530476","kaipan_new_date":"2017-10-28","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{"front":"周边","value":63649,"back":"元/m²","toast":"根据本楼盘往期开盘均价、同区域板块在售新房均价、同区域板块二手房指导均价，通过安居客大数据运算，形成价格参考。楼盘实际售价以开发商取得\u201c预售许可证\u201d后的实际开盘价格为准。"},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"100000㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"416361","loupan_name":"中铁华侨城和园","city_id":"14","new_price_value":"800","new_price_back":"万元/套起","price":0,"region_id":"865","region_title":"大兴","sub_region_id":"869","sub_region_title":"旧宫","default_image":"http://pic2.ajkimg.com/display/xinfang/1c42035944c5a3025038914e7ac8c02e/275x206n.jpg?t=5","address":"公园北环路","activity_tags_icon":[],"show_activity":{"title":"建筑面积 121-139㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"公园,五环至六环,商场,医院,银行","status_sale":"3","has_sale":0,"lat":"39.789169","lng":"116.456609","baidu_lat":"39.794822","baidu_lng":"116.463218","kaipan_new_date":"2018-05-31","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":1,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"165765.00㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"121-139㎡全智能雅艺大宅劲销全城"}],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"412544","loupan_name":"泽信公馆","city_id":"14","new_price_value":"960","new_price_back":"万元/套起","price":0,"region_id":"753","region_title":"丰台","sub_region_id":"769","sub_region_title":"科技园区","default_image":"http://pic2.ajkimg.com/display/xinfang/d98ce29799e87acd57b77f426c851a94/275x206n.jpg?t=5","address":"看丹路","activity_tags_icon":[],"show_activity":{"title":"建筑面积 103-142㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,四环至五环,公交枢纽,大主卧,大客厅","status_sale":"3","has_sale":0,"lat":"39.8387","lng":"116.282683","baidu_lat":"39.845044","baidu_lng":"116.289051","kaipan_new_date":"2017-05-10","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"80640.00㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"252145","loupan_name":"碧桂园官厅湖","city_id":"14","new_price_value":"","new_price_back":"","price":0,"region_id":"8669","region_title":"投资","sub_region_id":"16668","sub_region_title":"张家口","default_image":"http://pic2.ajkimg.com/display/xinfang/9b4c133d2c5528a45cb26976d515d104/275x206n.jpg?t=5","address":"怀来八达岭高速东花园出口西南方向9公里小南辛堡镇碧桂园官厅湖项目","activity_tags_icon":[],"show_activity":{"title":"建筑面积 77-398㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,使用面积多,全朝南,投资地产,露台","status_sale":"7","has_sale":0,"lat":"40.303878","lng":"115.678153","baidu_lat":"40.321929","baidu_lng":"115.681167","kaipan_new_date":"","activity_tags":{},"has_consultant":1,"sale_title":"待售","recommend_price":{"front":"周边","value":14400,"back":"元/m²","toast":"根据本楼盘往期开盘均价、同区域板块在售新房均价、同区域板块二手房指导均价，通过安居客大数据运算，形成价格参考。楼盘实际售价以开发商取得\u201c预售许可证\u201d后的实际开盘价格为准。"},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"110502㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"411083","loupan_name":"北京壹号院","city_id":"14","new_price_value":"170000","new_price_back":"元/㎡","price":170000,"region_id":"642","region_title":"朝阳","sub_region_id":"10263","sub_region_title":"三里屯","default_image":"http://pic2.ajkimg.com/display/xinfang/f4e79d8b292d1faf66e6ef35f66ec91b/275x206n.jpg?t=5","address":"农展北路8号","activity_tags_icon":[],"show_activity":{"title":"建筑面积 263-299㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"轨交房,大平层,三环至四环,大型超市,运动健身","status_sale":"3","has_sale":0,"lat":"39.942542","lng":"116.468579","baidu_lat":"39.948223","baidu_lng":"116.475172","kaipan_new_date":"2015-05","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"59152.00㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}},{"fang_type":"xinfang","info":{"loupan_id":"414344","loupan_name":"碧桂园莫奈的湖","city_id":"14","new_price_value":"12000","new_price_back":"元/㎡","price":12000,"region_id":"8672","region_title":"武清","sub_region_id":"8673","sub_region_title":"武清","default_image":"http://pic2.ajkimg.com/display/xinfang/21d5f249c59bdd588243dc44ccda3267/275x206n.jpg?t=5","address":"梅上新区杨六路东段","activity_tags_icon":[],"show_activity":{"title":"建筑面积 86-174㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"六环以外,公园,山景,美食街,银行","status_sale":"3","has_sale":0,"lat":"39.417412","lng":"117.154622","baidu_lat":"39.423328632645","baidu_lng":"117.16115290013","kaipan_new_date":"2017-05-01","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"219643㎡","activity":[],"_activity_tags_icon":[],"_show_activity":{"title":"建筑面积 46-90㎡","color":"#999999"}}}]
         * next_page : 1
         */

        private String title;
        private String total;
        private int next_page;
        private List<RowsBean> rows;

        public static ResultBean objectFromData(String str) {

            return new com.google.gson.Gson().fromJson(str, ResultBean.class);
        }

        public static ResultBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ResultBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public int getNext_page() {
            return next_page;
        }

        public void setNext_page(int next_page) {
            this.next_page = next_page;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * fang_type : xinfang
             * info : {"loupan_id":"250211","loupan_name":"首开香溪郡","city_id":"14","new_price_value":"400","new_price_back":"万元/套起","price":0,"region_id":"818","region_title":"通州","sub_region_id":"5397","sub_region_title":"宋庄","default_image":"http://pic2.ajkimg.com/display/xinfang/f8f0e165b85a451848b906e4bd9221dc/275x206n.jpg?t=5","address":"东北五环通顺路与窑管路交口西侧(东坝向东八公里)","activity_tags_icon":[],"show_activity":{"title":"建筑面积 90-105㎡","color":"#999999"},"tuangou":{},"zhuankft":{},"kft":{},"sale_label":"","loupan_property_type":"住宅","tags":"河景,大阳台,大平层,五环至六环,大主卧","status_sale":"4","has_sale":0,"lat":"40.008691","lng":"116.669762","baidu_lat":"40.013746","baidu_lng":"116.678723","kaipan_new_date":"2017-11-04","activity_tags":{},"has_consultant":1,"sale_title":"在售","recommend_price":{},"fang_type":"xinfang","multi_image":[],"brand":{},"has_video":0,"has_aerial_photo":0,"has_quanjing":0,"area_rage":"","jianzhu_area":"279332㎡","activity":[{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"通州洋房二到四居珍藏入市"}]}
             */

            private String fang_type;
            private InfoBean info;

            public static RowsBean objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, RowsBean.class);
            }

            public static RowsBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(jsonObject.getString(str), RowsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public String getFang_type() {
                return fang_type;
            }

            public void setFang_type(String fang_type) {
                this.fang_type = fang_type;
            }

            public InfoBean getInfo() {
                return info;
            }

            public void setInfo(InfoBean info) {
                this.info = info;
            }

            public static class InfoBean {
                /**
                 * loupan_id : 250211
                 * loupan_name : 首开香溪郡
                 * city_id : 14
                 * new_price_value : 400
                 * new_price_back : 万元/套起
                 * price : 0
                 * region_id : 818
                 * region_title : 通州
                 * sub_region_id : 5397
                 * sub_region_title : 宋庄
                 * default_image : http://pic2.ajkimg.com/display/xinfang/f8f0e165b85a451848b906e4bd9221dc/275x206n.jpg?t=5
                 * address : 东北五环通顺路与窑管路交口西侧(东坝向东八公里)
                 * activity_tags_icon : []
                 * show_activity : {"title":"建筑面积 90-105㎡","color":"#999999"}
                 * tuangou : {}
                 * zhuankft : {}
                 * kft : {}
                 * sale_label :
                 * loupan_property_type : 住宅
                 * tags : 河景,大阳台,大平层,五环至六环,大主卧
                 * status_sale : 4
                 * has_sale : 0
                 * lat : 40.008691
                 * lng : 116.669762
                 * baidu_lat : 40.013746
                 * baidu_lng : 116.678723
                 * kaipan_new_date : 2017-11-04
                 * activity_tags : {}
                 * has_consultant : 1
                 * sale_title : 在售
                 * recommend_price : {}
                 * fang_type : xinfang
                 * multi_image : []
                 * brand : {}
                 * has_video : 0
                 * has_aerial_photo : 0
                 * has_quanjing : 0
                 * area_rage :
                 * jianzhu_area : 279332㎡
                 * activity : [{"type":"qiang","icon":"http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png","title":"通州洋房二到四居珍藏入市"}]
                 */

                private String loupan_id;
                private String loupan_name;
                private String city_id;
                private String new_price_value;
                private String new_price_back;
                private int price;
                private String region_id;
                private String region_title;
                private String sub_region_id;
                private String sub_region_title;
                private String default_image;
                private String address;
                private ShowActivityBean show_activity;
                private TuangouBean tuangou;
                private ZhuankftBean zhuankft;
                private KftBean kft;
                private String sale_label;
                private String loupan_property_type;
                private String tags;
                private String status_sale;
                private int has_sale;
                private String lat;
                private String lng;
                private String baidu_lat;
                private String baidu_lng;
                private String kaipan_new_date;
                private ActivityTagsBean activity_tags;
                private int has_consultant;
                private String sale_title;
                private RecommendPriceBean recommend_price;
                private String fang_type;
                private BrandBean brand;
                private int has_video;
                private int has_aerial_photo;
                private int has_quanjing;
                private String area_rage;
                private String jianzhu_area;
                private List<?> activity_tags_icon;
                private List<?> multi_image;
                private List<ActivityBean> activity;

                public static InfoBean objectFromData(String str) {

                    return new com.google.gson.Gson().fromJson(str, InfoBean.class);
                }

                public static InfoBean objectFromData(String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new com.google.gson.Gson().fromJson(jsonObject.getString(str), InfoBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public String getLoupan_id() {
                    return loupan_id;
                }

                public void setLoupan_id(String loupan_id) {
                    this.loupan_id = loupan_id;
                }

                public String getLoupan_name() {
                    return loupan_name;
                }

                public void setLoupan_name(String loupan_name) {
                    this.loupan_name = loupan_name;
                }

                public String getCity_id() {
                    return city_id;
                }

                public void setCity_id(String city_id) {
                    this.city_id = city_id;
                }

                public String getNew_price_value() {
                    return new_price_value;
                }

                public void setNew_price_value(String new_price_value) {
                    this.new_price_value = new_price_value;
                }

                public String getNew_price_back() {
                    return new_price_back;
                }

                public void setNew_price_back(String new_price_back) {
                    this.new_price_back = new_price_back;
                }

                public int getPrice() {
                    return price;
                }

                public void setPrice(int price) {
                    this.price = price;
                }

                public String getRegion_id() {
                    return region_id;
                }

                public void setRegion_id(String region_id) {
                    this.region_id = region_id;
                }

                public String getRegion_title() {
                    return region_title;
                }

                public void setRegion_title(String region_title) {
                    this.region_title = region_title;
                }

                public String getSub_region_id() {
                    return sub_region_id;
                }

                public void setSub_region_id(String sub_region_id) {
                    this.sub_region_id = sub_region_id;
                }

                public String getSub_region_title() {
                    return sub_region_title;
                }

                public void setSub_region_title(String sub_region_title) {
                    this.sub_region_title = sub_region_title;
                }

                public String getDefault_image() {
                    return default_image;
                }

                public void setDefault_image(String default_image) {
                    this.default_image = default_image;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public ShowActivityBean getShow_activity() {
                    return show_activity;
                }

                public void setShow_activity(ShowActivityBean show_activity) {
                    this.show_activity = show_activity;
                }

                public TuangouBean getTuangou() {
                    return tuangou;
                }

                public void setTuangou(TuangouBean tuangou) {
                    this.tuangou = tuangou;
                }

                public ZhuankftBean getZhuankft() {
                    return zhuankft;
                }

                public void setZhuankft(ZhuankftBean zhuankft) {
                    this.zhuankft = zhuankft;
                }

                public KftBean getKft() {
                    return kft;
                }

                public void setKft(KftBean kft) {
                    this.kft = kft;
                }

                public String getSale_label() {
                    return sale_label;
                }

                public void setSale_label(String sale_label) {
                    this.sale_label = sale_label;
                }

                public String getLoupan_property_type() {
                    return loupan_property_type;
                }

                public void setLoupan_property_type(String loupan_property_type) {
                    this.loupan_property_type = loupan_property_type;
                }

                public String getTags() {
                    return tags;
                }

                public void setTags(String tags) {
                    this.tags = tags;
                }

                public String getStatus_sale() {
                    return status_sale;
                }

                public void setStatus_sale(String status_sale) {
                    this.status_sale = status_sale;
                }

                public int getHas_sale() {
                    return has_sale;
                }

                public void setHas_sale(int has_sale) {
                    this.has_sale = has_sale;
                }

                public String getLat() {
                    return lat;
                }

                public void setLat(String lat) {
                    this.lat = lat;
                }

                public String getLng() {
                    return lng;
                }

                public void setLng(String lng) {
                    this.lng = lng;
                }

                public String getBaidu_lat() {
                    return baidu_lat;
                }

                public void setBaidu_lat(String baidu_lat) {
                    this.baidu_lat = baidu_lat;
                }

                public String getBaidu_lng() {
                    return baidu_lng;
                }

                public void setBaidu_lng(String baidu_lng) {
                    this.baidu_lng = baidu_lng;
                }

                public String getKaipan_new_date() {
                    return kaipan_new_date;
                }

                public void setKaipan_new_date(String kaipan_new_date) {
                    this.kaipan_new_date = kaipan_new_date;
                }

                public ActivityTagsBean getActivity_tags() {
                    return activity_tags;
                }

                public void setActivity_tags(ActivityTagsBean activity_tags) {
                    this.activity_tags = activity_tags;
                }

                public int getHas_consultant() {
                    return has_consultant;
                }

                public void setHas_consultant(int has_consultant) {
                    this.has_consultant = has_consultant;
                }

                public String getSale_title() {
                    return sale_title;
                }

                public void setSale_title(String sale_title) {
                    this.sale_title = sale_title;
                }

                public RecommendPriceBean getRecommend_price() {
                    return recommend_price;
                }

                public void setRecommend_price(RecommendPriceBean recommend_price) {
                    this.recommend_price = recommend_price;
                }

                public String getFang_type() {
                    return fang_type;
                }

                public void setFang_type(String fang_type) {
                    this.fang_type = fang_type;
                }

                public BrandBean getBrand() {
                    return brand;
                }

                public void setBrand(BrandBean brand) {
                    this.brand = brand;
                }

                public int getHas_video() {
                    return has_video;
                }

                public void setHas_video(int has_video) {
                    this.has_video = has_video;
                }

                public int getHas_aerial_photo() {
                    return has_aerial_photo;
                }

                public void setHas_aerial_photo(int has_aerial_photo) {
                    this.has_aerial_photo = has_aerial_photo;
                }

                public int getHas_quanjing() {
                    return has_quanjing;
                }

                public void setHas_quanjing(int has_quanjing) {
                    this.has_quanjing = has_quanjing;
                }

                public String getArea_rage() {
                    return area_rage;
                }

                public void setArea_rage(String area_rage) {
                    this.area_rage = area_rage;
                }

                public String getJianzhu_area() {
                    return jianzhu_area;
                }

                public void setJianzhu_area(String jianzhu_area) {
                    this.jianzhu_area = jianzhu_area;
                }

                public List<?> getActivity_tags_icon() {
                    return activity_tags_icon;
                }

                public void setActivity_tags_icon(List<?> activity_tags_icon) {
                    this.activity_tags_icon = activity_tags_icon;
                }

                public List<?> getMulti_image() {
                    return multi_image;
                }

                public void setMulti_image(List<?> multi_image) {
                    this.multi_image = multi_image;
                }

                public List<ActivityBean> getActivity() {
                    return activity;
                }

                public void setActivity(List<ActivityBean> activity) {
                    this.activity = activity;
                }

                public static class ShowActivityBean {
                    public static ShowActivityBean objectFromData(String str) {

                        return new com.google.gson.Gson().fromJson(str, ShowActivityBean.class);
                    }

                    public static ShowActivityBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ShowActivityBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }
                }

                public static class TuangouBean {
                    public static TuangouBean objectFromData(String str) {

                        return new com.google.gson.Gson().fromJson(str, TuangouBean.class);
                    }

                    public static TuangouBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), TuangouBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }
                }

                public static class ZhuankftBean {
                    public static ZhuankftBean objectFromData(String str) {

                        return new com.google.gson.Gson().fromJson(str, ZhuankftBean.class);
                    }

                    public static ZhuankftBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ZhuankftBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }
                }

                public static class KftBean {
                    public static KftBean objectFromData(String str) {

                        return new com.google.gson.Gson().fromJson(str, KftBean.class);
                    }

                    public static KftBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), KftBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }
                }

                public static class ActivityTagsBean {
                    public static ActivityTagsBean objectFromData(String str) {

                        return new com.google.gson.Gson().fromJson(str, ActivityTagsBean.class);
                    }

                    public static ActivityTagsBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ActivityTagsBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }
                }

                public static class RecommendPriceBean {
                    public static RecommendPriceBean objectFromData(String str) {

                        return new com.google.gson.Gson().fromJson(str, RecommendPriceBean.class);
                    }

                    public static RecommendPriceBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), RecommendPriceBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }
                }

                public static class BrandBean {
                    public static BrandBean objectFromData(String str) {

                        return new com.google.gson.Gson().fromJson(str, BrandBean.class);
                    }

                    public static BrandBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), BrandBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }
                }

                public static class ActivityBean {
                    /**
                     * type : qiang
                     * icon : http://pic1.ajkimg.com/material/get/ba184d7d3f5aaf1a303c85308b3d32c0.png
                     * title : 通州洋房二到四居珍藏入市
                     */

                    private String type;
                    private String icon;
                    private String title;

                    public static ActivityBean objectFromData(String str) {

                        return new com.google.gson.Gson().fromJson(str, ActivityBean.class);
                    }

                    public static ActivityBean objectFromData(String str, String key) {

                        try {
                            JSONObject jsonObject = new JSONObject(str);

                            return new com.google.gson.Gson().fromJson(jsonObject.getString(str), ActivityBean.class);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }
                }
            }
        }
    }
}
