    package com.loremipsum.lolmsistattracker.service;

    import com.loremipsum.lolmsistattracker.model.Player;
    import com.loremipsum.lolmsistattracker.repository.PlayerRepository;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class PlayerService
    {
        private final PlayerRepository playerRepo;


        public PlayerService(PlayerRepository playerRepo)
        {
            this.playerRepo = playerRepo;
        }



        public Player addPlayer(Player player)
        {
            return playerRepo.save(player);
        }

        public void deletePlayer(Long id)
        {
            playerRepo.deleteById(id);
        }

        public Player updatePlayer(Long id, Player updatedPlayer)
        {
            Player currentPlayer = playerRepo.findById(id).orElse(null);

            if(currentPlayer == null) throw new NullPointerException("Player name found with id: " + id);

            currentPlayer.setPlayerName(updatedPlayer.getPlayerName());
            currentPlayer.setKda(updatedPlayer.getKda());
            currentPlayer.setRole(updatedPlayer.getRole());
            currentPlayer.setTeam(updatedPlayer.getTeam());

            return playerRepo.save(currentPlayer);
        }



        public List<Player> getAllPlayers()
        {
            return playerRepo.findAll();
        }


        public List<Player> getPlayerByName(String player)
        {
            return playerRepo.findByPlayerNameIgnoreCase(player);
        }


    }
