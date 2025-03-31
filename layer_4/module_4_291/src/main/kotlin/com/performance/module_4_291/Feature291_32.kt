package com.performance.module_4_291

class Feature291UseCase0(
    private val repository: Feature291Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
