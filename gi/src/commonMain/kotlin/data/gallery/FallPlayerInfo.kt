package data.gallery

import data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_4_0)
@ProtoModel
internal interface FallPlayerInfo {
    var uid: Int
    var curScore: Int
    var ballCatchCountMap: Map<Int, Int>
    var isGround: Boolean
    var timeCost: Int
}