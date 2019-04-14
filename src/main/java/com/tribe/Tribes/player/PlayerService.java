package com.tribe.Tribes.player;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player addNewPlayer(Player newPlayer) {
        //TODO set villages too
        return playerRepository.save(newPlayer);
    }

    public Player getPlayerById(Integer id) {
        return playerRepository.getOne(id);
    }
}
