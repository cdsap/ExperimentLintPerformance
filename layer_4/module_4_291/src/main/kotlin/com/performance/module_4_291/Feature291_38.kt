package com.performance.module_4_291

class Feature291UseCase2(
    private val repository: Feature291Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
