package com.performance.module_4_293

class Feature293UseCase1(
    private val repository: Feature293Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
