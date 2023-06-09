package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_2_0)
@ProtoEnum
enum class ResinCostType {
    RESIN_COST_TYPE_NONE,
    RESIN_COST_TYPE_NORMAL,
    RESIN_COST_TYPE_CONDENSE,
    RESIN_COST_TYPE_REUNION_PRIVILEGE,
    @AddedIn(VERSION.V1_3_0)
    RESIN_COST_TYPE_OP_ACTIVITY,
    @AddedIn(VERSION.V1_4_0)
    RESIN_COST_TYPE_MATERIAL,
}