package com.xworkz.standards.service;

import com.xworkz.standards.repository.Repository;

public class ServiceImpl implements Service {
	private Repository repository;

	public ServiceImpl(Repository repository) {
		this.repository = repository;
	}

	@Override
	public String Push() {
		if (repository != null) {
			System.out.println("repository is not null");

			boolean saved = repository.save();
			if (saved) {
				System.out.println("Saved in repo");
				return "Success";
			} else {
				System.out.println(" not Saved in repo");
				return "Failure";
			}
			
		}
		return "issue";
	}
}
