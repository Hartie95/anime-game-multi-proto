package data.scene

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.RESPONSE)
interface PostEnterSceneRsp {
    @AddedIn(VERSION.V1_0_0)
    var enterSceneToken: Int
    var retCode: Int
}