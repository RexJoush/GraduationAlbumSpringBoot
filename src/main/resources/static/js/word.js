// 接收数据的promise对象
import dataObj from "./server.js"

// console.log(dataObj);
dataObj.then(value => {
    if (value.data.code === 1200) {
        let {studentInfo} = value.data.data;
        // console.log(data);
        // 第二页
        $(".outer2 span").html(`你是否还记得<br />相逢时九月的余温?<br />你是否也紧紧追逐<br />这个盛夏里的每一次定格？<br />
        2021年的今天<br />你将要与相处了<i style="color: #f9dd56"> ${studentInfo.page2.educationalSystem} </i>年的母校挥手告别<br />跃入更广阔的天地`);
        // 第三页
        $(".outer3 span").html(`在这<i style="color: #f9dd56"> ${studentInfo.page3.educationalSystem} </i>年的时光里<br />你留给了西大太多的回忆<br />有欢笑 有泪水<br />有奋斗后的喜悦<br />有拼搏过的成长`);
        // 第四页
        $(".outer4 span").html(`其中的酸甜苦辣<br />你或许记忆犹新<br />渐渐模糊也没关系<br />西大麻麻已经默默地<br />将这些点点滴滴留意珍藏了起来。<br /><br /><b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page4.name} </b>同学，<br />快来查收独属于你的西大记忆吧！`);
        // 第五页
        $(".outer5 span").html(`<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page5.enrollmentYear} </b>，<br />是我们相逢的日子。<br />那一天，<br />你带着家中的“千叮咛”“万嘱咐”向我走来。<br />我看着你既憧憬又忐忑的样子，<br />想象着你以后一千余日的大学生活。`);
        // 第六页
        if (studentInfo.page6.apartment && studentInfo.page6.dormitory && studentInfo.page6.bed && studentInfo.page6.roommates && studentInfo.page6.major && studentInfo.page6.dormitory) {
            $(".outer6 span").html(`住在<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page6.apartment} </b>号楼<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page6.dormitory} </b>宿舍<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page6.bed} </b>床位的你<br />是否记得与<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page6.roommates} </b>位室友的第一张合照？<br />是否曾在此起彼伏的闹钟催促中奔向<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page6.major} </b>的课堂？<br />是否会怀念阿姨的那声——“<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page6.dormitory} </b>食堂外卖”？`);
        } 
        else {
            $(".outer6 span").html(`从第一次走进宿舍，到毕业清宿<br />
            这方小小世界见证了你无数的喜怒哀乐<br />
            每一寸的布置都已刻入脑海<br />
            每个人的小小习惯你都难以忘怀。`);
        }

        // 第七页
        if (studentInfo.page7.firstToCanteen && studentInfo.page7.firstCost && studentInfo.page7.firstMeal && studentInfo.page7.totalTimesCanteen && studentInfo.page7.favoriteMeal && studentInfo.page7.favoriteMealTimes) {
            $(".outer7 span").html(`来到西大，你一定见过这样的经典搭配：<br />凉皮 夹馍
        配冰峰,不知其中哪一个是你的最爱？<br />在<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page7.firstToCanteen} </b>，你第一次走进食堂，用<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page7.firstCost} </b>元买了<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page7.firstMeal} </b>。<br />从下课铃声一响就奔向食堂,到后来慢悠悠地错峰吃饭<br />你一共踏进食堂<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page7.totalTimesCanteen} </b>次。<br /><b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page7.favoriteMeal} </b>对你来说一定是最特别的味道，<br />你曾在那里消费了<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page7.favoriteMealTimes} </b>次。`);
        }
        else{
            $(".outer7 span").html(`四年中，<br />
            食堂的百味烟火不断更新，<br />
            紧跟美食潮流。<br />
            你是否还记得它们的味道？<br />
            煲仔饭、香锅鸡、菠萝饭、杂粮煎饼、面夫子、麻辣香锅……<br />
            各种酸甜苦辣之下，<br />
            是你对西大的独家回忆。<br />
            哪怕风景变了，味道还在。`);
        }

        // 第八页
        if(studentInfo.page8.firstToLibrary && studentInfo.page8.totalTimesLibrary && studentInfo.page8.totalLoan && studentInfo.page8.exceeds && studentInfo.page8.bookName){
            $(".outer8 span").html(`“我们读书，而后知道自己并不孤单”<br /><b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page8.firstToLibrary} </b>，你走进图书馆，目光划过层层书架，搜寻到了第一本“心之所向”。<br />在之后的<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page8.totalTimesLibrary} </b>次到访之中，你共借阅了图书<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page8.totalLoan} </b>本，<br />超越了全校<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page8.exceeds} %</b>的校友。<br />其中，<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page8.bookName} </b>是你借阅时间最长的一本，<br />辗转翻书声，不负好时光，<br />里面一定藏匿着<br />你的心境与激荡。`);
        }  
        else{
            $(".outer8 span").html(`“我们读书，而后知道自己并不孤单”<br/>
            书可以是答案 可以是陪伴 可以是信仰<br/>
            可以是容器、可是是宝剑、可以是香水。<br/>
            当你走进图书馆，<br/>
            目光划过层层书架，<br/>
            沉浸在静谧的书香中时，<br/>
            就是你成长与蜕变的最佳见证。<br/>
            辗转翻书声，不负好时光。`);
        } 
        
        // 第九页
        if(studentInfo.page9.firstCourseTime && studentInfo.page9.firstCourseName && studentInfo.page9.totalCourses && studentInfo.page9.totalCredit && studentInfo.page9.totalClassHours){
            $(".outer9 span").html(`<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page9.firstCourseTime} </b><br />是你告别军训，走向教室的日子。<br />循着课程表上的安排，<br />你来到了<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page9.firstCourseName} </b>的课堂。<br />窗外的风景随着四季不断轮转，<br />窗内的你埋头苦学孜孜不倦。<br />学习了<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page9.totalCourses} </b>门课程，共计<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page9.totalCredit} </b>学分，<br />总时长达<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page9.totalClassHours} </b>个小时。`);
        }
        else{
            $(".outer9 span").html(`每一年对高考学子的关注，<br />
            也是你在暗暗回望自己的选择。<br />
            四年闪过<br />
            窗外的风景随着四季不断轮转，<br />
            窗内的你埋头苦学孜孜不倦。<br />
            你是否在一次次误解与融合中<br />
            与自己的专业步步深入<br />
            深觉出自己所追求的方向？`);
        }
        
        // 第十页
        if (studentInfo.page10.gymTimes <= 0) {
            $(".outer10 span").html(`疫情变幻莫测，<br />和谐、健康的生活来之不易。<br />2020年，彩虹体育馆正式开放。<br />你虽未曾预约过彩虹场地，<br />但操场上一定散布了你热烈的气息。<br />独立之思想、强健之体魄<br />皆应为西大青年追求的、具备的。`);
        } else {
            $(".outer10 span").html(`疫情变幻莫测，<br />和谐、健康的生活来之不易。<br />2020年，彩虹体育馆正式开放。<br />你曾预约过<b style = "font-size: 0.5rem; color: #f9dd56"> ${studentInfo.page10.gymTimes} </b>次场地，感受运动的快乐。<br />独立之思想、强健之体魄<br />皆应为西大青年追求的、具备的。`);
        }
        // 第十一页
        let rewardsStr = "";
        for (let i = 0; i < studentInfo.page11.rewards.length; i++) {
            rewardsStr += `<b style = "font-size: 0.5rem; color: #f9dd56">`
            rewardsStr += studentInfo.page11.rewards[i].award;
            rewardsStr += "</b><br />";
        }
        $(".outer11 span").html(`这四年，你走了很远的路<br />也收获了许多荣誉。<br /> ${rewardsStr} 种种成就的背后<br />是你从一个青涩的孩子，<br />到独当一面的大人的蜕变。`);
        // 第十二页
        $(".outer13 span").html(`岁月匆匆，这一站即将到达终点。<br />过去的日子，<br />西大将永远为你珍藏。<br />未来的日子，<br />你要继续年轻与勇敢。<br />山水万程，心持正大。`);
    }

})