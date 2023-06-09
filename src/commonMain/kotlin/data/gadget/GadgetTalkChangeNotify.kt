package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_4_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GadgetTalkChangeNotify {
    var gadgetEntityId: Int
    var curGadgetTalkState: Int
}