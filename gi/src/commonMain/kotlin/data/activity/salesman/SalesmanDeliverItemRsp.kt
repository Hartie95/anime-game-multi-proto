package data.activity.salesman

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_0_0)
@ProtoCommand(CommandType.RESPONSE)
interface SalesmanDeliverItemRsp {
    var scheduleId: Int
    var retcode: Int
}