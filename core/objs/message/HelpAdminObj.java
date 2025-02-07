package com.coloryr.allmusic.server.core.objs.message;

public class HelpAdminObj {
    public String reload;
    public String next;
    public String ban;
    public String banPlayer;
    public String url;
    public String delete;
    public String addList;
    public String clearList;
    public String cookie;
    public String test;

    public static HelpAdminObj make() {
        HelpAdminObj obj = new HelpAdminObj();
        obj.init();

        return obj;
    }

    public boolean check() {
        if (reload == null)
            return true;
        if (next == null)
            return true;
        if (ban == null)
            return true;
        if (url == null)
            return true;
        if (delete == null)
            return true;
        if (addList == null)
            return true;
        if (clearList == null)
            return true;
        if (banPlayer == null)
            return true;
        if (test == null)
            return true;
        return cookie == null;
    }

    public void init() {
        reload = "§d[AllMusic3]§e使用/music reload 重读配置文件";
        next = "§d[AllMusic3]§e使用/music next 强制切歌";
        ban = "§d[AllMusic3]§e使用/music ban [ID] 禁止点这首歌";
        banPlayer = "§d[AllMusic3]§e使用/music banplayer [ID] 禁止某位玩家点歌";
        url = "§d[AllMusic3]§e使用/music url [url] 播放一首自定义歌曲";
        delete = "§d[AllMusic3]§e使用/music delete [序号] 删除队列中的歌曲";
        addList = "§d[AllMusic3]§e使用/music addlist [歌单ID] 添加歌单到空闲列表";
        clearList = "§d[AllMusic3]§e使用/music clearlist 清空空闲歌单";
        cookie = "§d[AllMusic3]§e使用/music cookie [cookie] 填写cookie";
        test = "§d[AllMusic3]§e使用/music test [音乐ID] 测试解析音乐";
    }
}
