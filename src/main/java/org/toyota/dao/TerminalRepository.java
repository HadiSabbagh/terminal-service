package org.toyota.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.toyota.domain.Data;
import org.toyota.domain.Terminal;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Integer>
{
}
