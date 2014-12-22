package br.gov.mj.sislegis.app.service;

import java.util.Date;

import javax.ejb.Local;

import br.gov.mj.sislegis.app.model.Reuniao;

@Local
public interface ReuniaoService extends Service<Reuniao> {
	
	public Reuniao buscaReuniaoPorData(Date data);

}
