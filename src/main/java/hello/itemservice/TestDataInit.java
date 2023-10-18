package hello.itemservice;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@Slf4j
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;

    /**
     * 확인용 초기 데이터 추가
     */
    @EventListener(ApplicationReadyEvent.class)
    public void initData() {
        log.info("test data init");
        itemRepository.save(new Item("백엔드 주니어 개발자1", 1000000, "원티드랩에서 백엔드 주니어 개발자를 채용합니다. 자격요건은..", "Python"));
        itemRepository.save(new Item("백엔드 주니어 개발자", 1500000, "원티드랩에서 백엔드 주니어 개발자를 '적극' 채용합니다. 자격요건은..","python"));
    }

}
