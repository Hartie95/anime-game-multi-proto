package data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_4_0)
@ProtoModel
internal interface SceneGallerySalvagePreventInfo {
    var monsterCount: Int
}