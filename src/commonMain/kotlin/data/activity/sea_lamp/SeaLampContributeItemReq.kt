package data.activity.sea_lamp

import annotations.AddedIn
import data.general.Item.ItemParam
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.REQUEST)
interface SeaLampContributeItemReq {
    var itemList: List<ItemParam>
    @AddedIn(VERSION.V1_0_0)
    var activityId: Int
}