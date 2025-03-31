package com.performance.module_4_293

class Feature293UseCase2(
    private val repository: Feature293Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
