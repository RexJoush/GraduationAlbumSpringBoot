// 引入数据
import dataObj from "./server.js"
// 引入url
import {base_url} from "./url.js"

// 弹幕框样式
(function () {
    $("#danmu").danmu({
        height: 30 + "vh", //弹幕区高度
        width: 100 + "vw", //弹幕区宽度
        zindex: 100, //弹幕区域z-index属性
        speed: 20000, //滚动弹幕的默认速度，这是数值值得是弹幕滚过每672像素所需要的时间（毫秒）
        sumTime: 65535, //弹幕流的总时间
        danmuLoop: false, //是否循环播放弹幕
        defaultFontColor: "#3da9fc", //弹幕的默认颜色
        fontSizeSmall: 16, //小弹幕的字号大小
        FontSizeBig: 24, //大弹幕的字号大小
        opacity: "0.7", //默认弹幕透明度
        topBottonDanmuTime: 6000, // 顶部底部弹幕持续时间（毫秒）
        SubtitleProtection: false, //是否字幕保护
        positionOptimize: false, //是否位置优化，位置优化是指像AB站那样弹幕主要漂浮于区域上半部分
        maxCountInScreen: 40, //屏幕上的最大的显示弹幕数目,弹幕数量过多时,优先加载最新的。
        maxCountPerSec: 10 //每分秒钟最多的弹幕数目,弹幕数量过多时,优先加载最新的。
    });
})(jQuery);

// 实时添加弹幕
$("#img_botton").on("touchstart", function () {
    let text = $("#text").val();
    let time = $('#danmu').data("nowTime") + 5;
    if (text !== "") {
        let newd = {
            "text": text,
            "color": "white",
            "size": "1",
            "position": "0",
            "time": time
        };
        $("#danmu").danmu("addDanmu", newd)
        // 调入弹幕接口
        axios.get(`${base_url}/bullet/addBullet`, {
            params: {
                content: $("#text").val(),
            },
            head: {},
        });
        $("#text").val("");
    }
    
});


dataObj.then(value => {
    let {bullets} = value.data.data;
    console.log(bullets);
    // 弹幕数据
    let arr = [];
    // let random = Math.floor(Math.random() * 10 + 10);
    for (let i = 0; i < bullets.length; i++) {
        console.log(1);
        arr.push({
            text: bullets[i].name + ": " + bullets[i].content,
            color: "#fef6e4",
            size: 1,
            position: 0,
            time: i * 100
        });
    }
    // 添加初始弹幕
    $("#danmu").danmu("addDanmu",
        arr,
        // { text: "data", color: "yellow", size: 1, position: 0, time: 3 }
        // , { text: "这是底部弹幕", color: "red", size: 1, position: 2, time: 3 }
    )
});






// 执行弹幕
$('#danmu').danmu('danmuStart');