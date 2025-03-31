package com.performance.module_4_291

class Feature291UseCase1(
    private val repository: Feature291Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
