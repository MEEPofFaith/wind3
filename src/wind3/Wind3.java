package wind3;

import arc.*;
import arc.audio.*;
import arc.files.*;
import arc.struct.*;
import mindustry.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

import static mindustry.Vars.*;

public class Wind3 extends Mod{

    public Wind3(){
        if(!headless){
            Events.on(ClientLoadEvent.class, e -> {
                Seq<Sound> sounds = new Seq<>();
                Core.assets.getAll(Sound.class, sounds);

                Fi wind3 = Vars.tree.get("sounds/wind3.ogg");
                sounds.each(sound -> sound.load(wind3));
            });
        }
    }

    @Override
    public void loadContent(){}
}
