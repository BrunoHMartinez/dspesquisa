package com.devsuperior.com.devsuperior.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.com.devsuperior.dto.RecordDTO;
import com.devsuperior.com.devsuperior.dto.RecordInsertDTO;
import com.devsuperior.com.devsuperior.entities.Game;
import com.devsuperior.com.devsuperior.entities.Record;
import com.devsuperior.com.devsuperior.repositories.GameRepository;
import com.devsuperior.com.devsuperior.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();

		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);

		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}
