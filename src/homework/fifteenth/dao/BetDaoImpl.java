package homework.fifteenth.dao;

import homework.fifteenth.bd.Storage;
import homework.fifteenth.lib.Dao;
import homework.fifteenth.model.Bet;

import java.util.List;

@Dao
public class BetDaoImpl implements BetDao {
  @Override
  public void add(Bet bet) {
    Storage.bets.add(bet);
  }

  @Override
  public List<Bet> getAll() {
    return Storage. BETS;
  }
}
