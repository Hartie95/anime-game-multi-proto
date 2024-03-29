package data.activity.flight

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
@ProtoModel
interface FlightActivityDetailInfo {
    var dailyRecordList: List<FlightDailyRecord>
    var previewRewardId: Int
    var minOpenPlayerTime: Int
}