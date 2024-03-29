package data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_0_9_0)
@RemovedIn(Version.GI_1_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface ClientOpenShopmallNotify {
    var firstPageId: Int
    var secondPageId: Int
}