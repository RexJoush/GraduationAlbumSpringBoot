// 导入随机音频
let mp3 = `../音乐素材/难别紫藤.mp3`;
mp3 = new Audio(mp3);
// mp3.load();

// 弹幕图标
$barrage_img = $(".barrage_box img")
// 音乐图标
$music_img = $(".music_box img")
// 弹幕框
$danmu_box = $("#danmu");
// 弹幕输入框
$input_danmu = $(".input_danmu");

// 点击事件判断flag
let flag_barrage = true;
let flag_music = true;

// 弹幕点击事件
$(".barrage_box").on("click","img",function () {
    // 关闭弹幕  
    if (flag_barrage) {
        $("#unsend").css("opacity", 1);
        flag_barrage = false;
        // 停止弹幕
        $danmu_box.danmu('danmuStop');
        $input_danmu.css("opacity","0");
    }
    // 开启弹幕
    else {
        $("#unsend").css("opacity", 0);
        flag_barrage = true;
        // 播放弹幕
        $danmu_box.danmu('danmuStart');
        $input_danmu.css("opacity","1");
    }
});
// 定时器
let timer;
// 旋转角度
let angle = 0;

// 播放音乐
let mus = function () {
    // 播放音频
    mp3.play();
    // ios适配
    document.addEventListener("WeixinJSBridgeReady", function () {
        mp3.play();
    }, false);
    document.addEventListener('YixinJSBridgeReady', function () {
        mp3.play();
    }, false);
    // 图标旋转
    timer = setInterval(function () {
        angle += 3;
        $(".music_box img").rotate(angle);
        flag_music = false;
    }, 50);
}

// 打开自动播放音乐
mus();


// 音乐点击事件
$(".music_box").on("click","img",function () {
    // 关闭音乐
    if (!flag_music) {
        clearInterval(timer);
        // 暂停音频
        mp3.pause();
        flag_music = true;
    }
    // 开启音乐
    else {
        clearInterval(timer);
        // 产生随机数
        let num = Math.floor(Math.random() * 10);
        // 导入随机音频
        mp3 = `../音乐素材/b_${num}.mp3`;
        mp3 = new Audio(mp3);
        // mp3.load();
        mus();
    }
});