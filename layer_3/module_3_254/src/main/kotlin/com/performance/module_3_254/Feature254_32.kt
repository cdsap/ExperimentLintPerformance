package com.performance.module_3_254

class Feature254UseCase0(
    private val repository: Feature254Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
