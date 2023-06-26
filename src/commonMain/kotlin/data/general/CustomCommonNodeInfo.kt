package data.general

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_2_0)
@ProtoModel
interface CustomCommonNodeInfo {
    var parentIndex: Int
    val configId: Int
    val slotIdentifier: String
}