NoChatClear
==============
NoChatClear is a client-side Minecraft mod using Fabric.
With version 1.20.2 Mojang decided to clear the chat, when the client is entering the configuration-phase.
This happens for example when switching to a world with an other datapack, even if it is on the same proxy-server.
See this bug, which was closed as "Works As Intended": https://bugs.mojang.com/browse/MC-265250
For compiled builds (= downloads), see https://modrinth.com/mod/nochatclear

Compiling
=========
* Clone the repository
* Open a command prompt/terminal to the repository directory
* run 'gradlew build'
* The built jar file will be in build/libs/
