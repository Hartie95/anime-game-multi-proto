package data.activity.sea_lamp

import org.anime_game_servers.core.base.annotations.AddedIn
import data.activity.sea_lamp.legacy.SeaLampActivityInfo
import data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_3_0)
@ProtoCommand(CommandType.NOTIFY)
interface SeaLampFlyLampNotify {
    var pos: Vector
    var itemNum: Int
    var itemId: Int
    var param: Int
}