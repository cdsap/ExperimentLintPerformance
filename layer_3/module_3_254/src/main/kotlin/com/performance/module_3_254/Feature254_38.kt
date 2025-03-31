package com.performance.module_3_254

class Feature254UseCase2(
    private val repository: Feature254Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
