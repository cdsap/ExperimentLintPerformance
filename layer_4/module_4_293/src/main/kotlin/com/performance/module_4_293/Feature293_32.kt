package com.performance.module_4_293

class Feature293UseCase0(
    private val repository: Feature293Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
