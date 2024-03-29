package data.activity.crucible

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface CrucibleBattleUidInfo {
    var uid: Int
    var nickname: String
    var icon: Int
    var onlineId : String
}