package com.performance.module_1_134

class Feature134UseCase0(
    private val repository: Feature134Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
