package foundation.esoteric.fireworkwarscore.commands.aliases

import dev.jorel.commandapi.CommandAPICommand
import dev.jorel.commandapi.CommandPermission
import dev.jorel.commandapi.executors.CommandArguments
import foundation.esoteric.fireworkwarscore.FireworkWarsCorePlugin
import org.bukkit.entity.Player

class FriendListCommandAlias(private val plugin: FireworkWarsCorePlugin) : CommandAPICommand("friendlist") {
    init {
        this.withRequirement { it is Player }
        this.withPermission(CommandPermission.NONE)

        this.withShortDescription("List your friends")
        this.withFullDescription("List your friends.")
        this.withAliases("fl")

        this.executesPlayer(this::onPlayerExecution)
        this.register(plugin)
    }

    private fun onPlayerExecution(player: Player, args: CommandArguments) {
        plugin.friendCommand.listFriends(player, args)
    }
}