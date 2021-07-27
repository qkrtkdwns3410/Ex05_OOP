package default11;

import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

public class SystemSpeaker {
    //외부에서 SystemSpeaker에 하나만 접근가능하도록 static private >>

    static private SystemSpeaker instance;
    private int volume;

    //외부에서 생성X
    private SystemSpeaker() {
        volume = 5;

    }
    //getInstance .. null체크 >>
    public static SystemSpeaker getInstance() {
        if (instance == null) {
            //시스템 스피커와 통신할 수 있게하는 작업입니다.
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}

























