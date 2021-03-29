package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//If no profile is set, will be run as default
@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "greeting from my English constructor service";
	}
	
}
